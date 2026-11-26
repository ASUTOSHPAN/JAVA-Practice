package OOPS;
//1. Managing Professors in College. //////////////

// public class Main {
//     public static void main(String[] args) {
//         Professor pf1 = new Professor();
//         pf1.id = 1;
//         pf1.name = "Asutosh";
//         pf1.department = "CSE";
//         pf1.yearOfExperience = 10;
//         System.out.println("Professor id: " + pf1.id);
//         System.out.println("Professor name: " + pf1.name);
//         System.out.println("Professor Department: " + pf1.department);
//         pf1.conductLecture();
//         pf1.provideFeedback();
//     }
// }

// class Professor {
//     int id;
//     String name;
//     String department;
//     int yearOfExperience;

//     public void conductLecture() {
//         System.out.println(name + " is conducting a lecture.");
//     }

//     public void provideFeedback() {
//         System.out.println(name + " is providing feedback.");
//     }
// }

// // 2.Handling Employees in an Office. ////////////
// public class Main {
//     public static void main(String[] args) {
//         Employee emp1 = new Employee();
//         emp1.id = 1;
//         emp1.name = "Asutosh";
//         emp1.department = "Frontend";
//         emp1.yearOfExperience = 4;
//         System.out.println("Employee Id: " + emp1.id);
//         System.out.println("Employee Name: " + emp1.name);
//         System.out.println("Employee Department: " + emp1.department);
//         System.out.println("Employee Year Of Experience: " + emp1.yearOfExperience);
//         emp1.work();
//         emp1.attendMeeting();
//     }
// }

// class Employee {
//     int id;
//     String name;
//     String department;
//     int yearOfExperience;

//     public void work() {
//         System.out.println(name + " is working.");
//     }

//     public void attendMeeting() {
//         System.out.println(name + " is attending a meeting.");
//     }
// }

// 3. Modeling Vehicle Entities in a Car Dealership.
// public class Main {
//     public static void main(String[] args) {
//         Vehicle vehicle = new Vehicle();
//         vehicle.id = 101;
//         vehicle.make = "TATA";
//         vehicle.model = "Harrier";
//         vehicle.price = 30000;
//         vehicle.displayDetails();
//         vehicle.applyDiscount(15);
//     }
// }

// class Vehicle {
//     int id;
//     String make;
//     String model;
//     double price;

//     public void displayDetails() {
//         System.out.println("Vehicle Id: " + id);
//         System.out.println("Vehicle Maker: " + make);
//         System.out.println("Vehicle Model: " + model);
//         System.out.println("Vehicle Price: " + price);
//     }

//     public void applyDiscount(double percentage) {
//         price = price - (price * percentage / 100);
//         System.out.println("The new Price after discount: " + price);
//     }
// }

// 4. Imagine you are developing a notification system within an event managemnt application. 
// When an event is suceesfuly created, a notification needs to be sent immediately. 
// This notification does not need to be referenced after it is sent.
// public class Main {
//     public static void main(String[] args) {
//         new Notification().send();
//     }
// }

// class Notification {
//     public void send() {
//         System.out.println("Notification send.");
//     }
// }



