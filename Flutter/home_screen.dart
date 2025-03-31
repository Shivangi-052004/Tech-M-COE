import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class HomeScreen extends StatelessWidget {
    HomeScreen({super.key});
  final TextEditingController _taskController = TextEditingController();
  final CollectionReference tasks = FirebaseFirestore.instance.collection(
    'tasks',
  );

  void addTask() {
    if (_taskController.text.isNotEmpty) {
      tasks.add({'task': _taskController.text, 'timestamp': Timestamp.now()});
      _taskController.clear();
    }
  }

  void deleteTask(String id) {
    tasks.doc(id).delete();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("To-Do List")),
      body: Column(
        children: [
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: TextField(
              controller: _taskController,
              decoration: InputDecoration(
                labelText: "Enter task",
                suffixIcon: IconButton(
                  icon: Icon(Icons.add),
                  onPressed: addTask,
                ),
              ),
            ),
          ),
          Expanded(
            child: StreamBuilder(
              stream: tasks.orderBy('timestamp', descending: true).snapshots(),
              builder: (context, AsyncSnapshot<QuerySnapshot> snapshot) {
                if (!snapshot.hasData) return CircularProgressIndicator();
                return ListView(
                  children:
                      snapshot.data!.docs.map((doc) {
                        return ListTile(
                          title: Text(doc['task']),
                          trailing: IconButton(
                            icon: Icon(Icons.delete),
                            onPressed: () => deleteTask(doc.id),
                          ),
                        );
                      }).toList(),
                );
              },
            ),
          ),
        ],
      ),
    );
  }
}
