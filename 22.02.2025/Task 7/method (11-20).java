public class FileReaderExample {
    
    // 0. Shuffle elements in an array list
    public static void shuffleList() {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Collections.shuffle(colors);
        System.out.println("Shuffled List: " + colors);
    }

    // 11. Append element to the end of a linked list
    public static void appendToLinkedList() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.add("D");
        System.out.println("Linked List after appending: " + list);
    }

    // 12. Iterate through linked list elements
    public static void iterateLinkedList() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        for (String item : list) {
            System.out.println(item);
        }
    }

    // 13. Iterate linked list starting at a specified position
    public static void iterateFromPosition(int index) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        Iterator<String> iterator = list.listIterator(index);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 14. Iterate a linked list in reverse order
    public static void iterateReverse() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 15. Insert element at a specified position in the linked list
    public static void insertAtPosition(int index, String element) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.add(index, element);
        System.out.println("Linked List after insertion: " + list);
    }

    // 16. Insert elements at the first and last positions
    public static void insertAtFirstAndLast(String first, String last) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("B", "C"));
        list.addFirst(first);
        list.addLast(last);
        System.out.println("Linked List after inserting at first and last: " + list);
    }

    // 17. Insert element at the front of a linked list
    public static void insertAtFront(String element) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("B", "C"));
        list.addFirst(element);
        System.out.println("Linked List after inserting at front: " + list);
    }

    // 18. Insert element at the end of a linked list
    public static void insertAtEnd(String element) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.addLast(element);
        System.out.println("Linked List after inserting at end: " + list);
    }

    // 19. Insert elements at a specified position in a linked list
    public static void insertMultipleAtPosition(int index, List<String> elements) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.addAll(index, elements);
        System.out.println("Linked List after inserting elements: " + list);
    }

    // 20. Get the first and last occurrence of an element in a linked list
    public static void findFirstAndLastOccurrence(String element) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "A", "D"));
        System.out.println("First occurrence of " + element + ": " + list.indexOf(element));
        System.out.println("Last occurrence of " + element + ": " + list.lastIndexOf(element));
    }
