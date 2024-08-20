### Overview
This project demonstrates the use of Java Generics to create flexible and type-safe data structures and algorithms. 
The key components of this project include a generic linked list implementation, a method to find the maximum value in a collection, and various classes that utilize generics to handle different data types.

### Project Structure
* Main.java: The entry point of the application. It demonstrates the usage of the generic classes and methods defined in the project.
* LinkedList.java: Implements a generic linked list data structure that can store elements of any type. It includes methods to add, remove, and traverse elements in the list.
* Cell.java: Represents a node in the LinkedList, storing a value of a generic type and a reference to the next node.
* Max.java: Contains a generic method that finds the maximum value in a list of comparable elements. This showcases how generics can be used to create flexible algorithms.
* Person.java: A sample class used to demonstrate the generic linked list and other generic methods. It represents a person with attributes like name and age.
* EmptyListException.java: A custom exception class used in the LinkedList to handle cases where operations are attempted on an empty list.
* run.bat: A batch script to compile and run the project easily.

### How to Run the Program
* Ensure that you have the Java Development Kit (JDK 8 or higher) installed on your system.
* Open the command line and navigate to the directory containing the program files.
* Run the program using the provided run.bat script, or by typing the following command:`java Main`.
