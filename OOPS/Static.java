package OOPS;

// public class Static {
//     public static void main(String[] args) {
//         Program.display1();
//         Program p1 = new Program();
//         p1.display2();
//     }
// }

// class Program {
//     static int a;
//     static {
//         System.out.println("In the static block.");
//         a = 10;
//     }

//     static void display1() {
//         System.out.println("In the static method.");
//         System.out.println(a);
//     }
//     int b;
//     {
//         System.out.println("In the non-static block.");
//         b=20;
//     }
//     public void display2() {
//         System.out.println("In the non-static method.");
//         System.out.println(b);
//     }
// }

// 2. You need to create a class called "ClassRoom" that has a static variable 
// "totalAttendance" and a non-static variable "classroomAttendance". 
// The class should have a method "markAttendance" that increments both variables by 1.
// The class should also have a method "displayAttendance" that displays the values of both variables.

// public class Static {
//     public static void main(String[] args) {
//         ClassRoom classroom = new ClassRoom();
//         classroom.markAttendance();
//         classroom.displayAttaendance();
//     }
// }

// class ClassRoom {
//     static int totalAttendance = 0;
//     int classroomAttendance = 0;

//     void markAttendance() {
//         classroomAttendance++;
//         totalAttendance++;
//     }

//     void displayAttaendance() {
//         System.out.println("Attendance in this class room: " + classroomAttendance);
//         System.out.println("Attendance in School: " + totalAttendance);
//     }
// }

// 3. You need to create a simple calculator that can perform basic arithmetic operations 
// (addition, subtraction, multiplication, and division) using static methods.
// The user should be able to input two numbers and choose the operation they want to perform. 
// The program should then display the result of the operation.

// import java.util.Scanner;
// public class Static {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the operation: ");
//         String operation = sc.next();
//         System.out.println("Enter 1st number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int b = sc.nextInt();
//         if (operation.equals("Addition")) {
//             Operations.Addition(a, b);
//         } else if (operation.equals("Subtraction")) {
//             Operations.Subtraction(a, b);
//         } else if (operation.equals("Multiplication")) {
//             Operations.multilplication(a, b);
//         } else if (operation.equals("Division")) {
//             Operations.division(a, b);
//         } else {
//             System.out.println("Invalid Operation. Operation should be Addition/ Subtraction/ Multiplication/ Division.");
//         }
//         sc.close();
//     }
// }

// class Operations {
//     static void Addition(int a, int b) {
//         System.out.println("The addition is: " + (a + b));
//     }

//     static void Subtraction(int a, int b) {
//         System.out.println("The subtraction is: " + (a - b));
//     }

//     static void multilplication(int a, int b) {
//         System.out.println("The multilplication is: " + (a * b));
//     }

//     static void division(int a, int b) {
//         System.out.println("The Division is: " + (a / b));
//     }
// }