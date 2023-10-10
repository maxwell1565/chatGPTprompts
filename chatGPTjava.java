What is a class in javascript?

In JavaScript, a class is a blueprint or a template for creating objects that share the same structure and behavior. Classes provide a way to define a common set of properties (also known as attributes or fields) and methods (functions) that objects created from the class will have. This concept is part of ECMAScript 6 (ES6) and introduced a more structured and object-oriented way of defining objects and their behaviors in JavaScript.

Here's a basic example of how you can define a class in JavaScript:

class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  sayHello() {
    console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
  }
}

// Creating objects from the Person class
const person1 = new Person("Alice", 30);
const person2 = new Person("Bob", 25);

person1.sayHello(); // Outputs: Hello, my name is Alice and I am 30 years old.
person2.sayHello(); // Outputs: Hello, my name is Bob and I am 25 years old.

In the example above:

We define a class called Person using the class keyword.
Inside the class, we have a constructor method, which is a special method that gets called when an object is created from the class. It initializes the object's properties.
We define a sayHello method within the class, which can be called on objects created from the Person class.
Classes in JavaScript provide a more structured way to work with objects and inheritance. They can also be extended to create subclasses and inherit properties and methods from other classes using the extends keyword. This helps organize and encapsulate code, making it easier to manage and maintain larger JavaScript applications.