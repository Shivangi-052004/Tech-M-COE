let student = {
    name: "John",
    age: 20,
    grade: "A",
    displayInfo: function() {
        console.log(`Name: ${this.name}, Age: ${this.age}, Grade: ${this.grade}`);
    }
};

// Accessing properties and method
console.log(student.name);
console.log(student.age);
console.log(student.grade);
student.displayInfo();

// Adding nested object and new methods
student.address = {
    city: "New York",
    zip: "10001"
};

student.updateGrade = function(newGrade) {
    this.grade = newGrade;
    console.log(`Updated Grade: ${this.grade}`);
};

student.getAddress = function() {
    console.log(`City: ${this.address.city}, ZIP: ${this.address.zip}`);
};

// Accessing new properties and methods
console.log(student.address.city);
console.log(student.address.zip);
student.updateGrade("A+");
student.getAddress();

// Removing a property and a method
delete student.age;
delete student.displayInfo;

// Display updated object
console.log(student);
