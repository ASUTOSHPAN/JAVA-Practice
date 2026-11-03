// // // // // // //For-loop in Java./////////
// // // // // // // // // //Sum of natural numbers 1 to 10 ////////////
// // // // // // // // // public class Loops {
// // // // // // // // // public static void main(String[] args) {
// // // // // // // // // int sum = 0;
// // // // // // // // // for(int i = 1; i <= 10; i++) {
// // // // // // // // // sum += i;
// // // // // // // // // }
// // // // // // // // // System.out.println("The sum of the 1st ten natural
// // numbers is " + sum);
// // // // // // // // // }
// // // // // // // // // }

// // // // // // // // //Calculating the sum of First N natural numbers in Java.
// // ////////
// // // // // // // // import java.util.Scanner;
// // // // // // // // public class Loops {
// // // // // // // // public static void main(String[] args) {
// // // // // // // // Scanner sc = new Scanner(System.in);
// // // // // // // // System.out.println("Enter a number to find the sum of first
// // N natural numbers: ");
// // // // // // // // int num = sc.nextInt();
// // // // // // // // int sum = 0;
// // // // // // // // for(int i = 1; i <= num; i++) {
// // // // // // // // sum += i;
// // // // // // // // }
// // // // // // // // System.out.println("The sum of 1st N numbers is: " + sum);
// // // // // // // // }
// // // // // // // // }

// // // // // // // // Counting down with a for loop in Java. ////////
// // // // // // // import java.util.Scanner;
// // // // // // // public class Loops {
// // // // // // // public static void main(String[] args) {
// // // // // // // System.out.println("Enter a number to count down from: ");
// // // // // // // Scanner sc = new Scanner(System.in);
// // // // // // // int num = sc.nextInt();
// // // // // // // for(int i = num; i >= 0; i--) {
// // // // // // // System.out.println(i);
// // // // // // // }
// // // // // // // }
// // // // // // // }

// // // // // // // //Table Printer using for loop.//////
// // // // // //// import java.util.Scanner;
// // // // // //// public class Loops {
// // // // // //// public static void main(String[] args) {
// // // // // //// try (Scanner sc = new Scanner(System.in)) {
// // // // // //// System.out.print("Enter a number to print the table: ");
// // // // // //// int num = sc.nextInt();
// // // // // //// // int i = 1;
// // // // // //// for (int i = 1; i <= 10; i++) {
// // // // // //// System.out.println(num + " * " + i + " = " + (num * i));
// // // // // //// }
// // // // // //// }
// // // // // //// }
// // // // // //// }

// // // // // // //While Loop in Java.//////
// // // // // // //Calculate the factorial of a given number.
// // // // // // import java.util.Scanner;

// // // // // // public class Loops {
// // // // // // public static void main(String[] args) {
// // // // // // System.out.println("Enter a number to find the factorial: ");
// // // // // // try (Scanner sc = new Scanner(System.in)) {
// // // // // // int num = sc.nextInt();
// // // // // // int factorial = 1;
// // // // // // int i = 1;
// // // // // // while (i <= num) {
// // // // // // factorial = factorial * i;
// // // // // // i++;
// // // // // // }
// // // // // // System.out.println("The factorial of " + num + " is: " +
// // factorial);
// // // // // // }
// // // // // // }
// // // // // // }

// // // // // //Print even numbers from 1 to N using while loop.
// // // // // import java.util.Scanner;
// // // // // public class Loops {
// // // // // public static void main(String[] args) {
// // // // // System.out.println("Enter a number: ");
// // // // // try(Scanner sc = new Scanner(System.in)) {
// // // // // int num = sc.nextInt();
// // // // // while (num > 0) {
// // // // // if(num % 2 == 0) {
// // // // // System.out.println("The even number is: " + num);
// // // // // }
// // // // // num--;
// // // // // }
// // // // // }
// // // // // }
// // // // // }

// // // // //Write a program that prints all the numbers N to 1 using while loop.
// // ////////
// // // // import java.util.Scanner;
// // // // public class Loops {
// // // // public static void main(String[] args) {
// // // // System.out.println("Enter a number: ");
// // // // try(Scanner sc = new Scanner(System.in)){
// // // // int num = sc.nextInt();
// // // // // int i = 1;
// // // // while(num > 0) {
// // // // System.out.println(num);
// // // // num--;
// // // // }
// // // // }
// // // // }
// // // // }

// // // //do-while loops in Java.///////////
// // // //Ask a user to enter a number greater than 10 at least once.
// // // // import java.util.Scanner;
// // // // public class Loops {
// // // // public static void main(String[] args) {
// // // // try (Scanner sc = new Scanner(System.in)) {
// // // // int num;
// // // // do {
// // // // System.out.println("Enter a number greater than 10 at least once: ");
// // // // num = sc.nextInt();
// // // // } while (num <= 10);
// // // // System.out.println("Thank you! Number is greater than 10.");
// // // // }
// // // // }
// // // // }

// // // //Table Printer //
// // // import java.util.Scanner;
// // // public class Loops {
// // // public static void main(String[] args) {
// // // try (Scanner sc = new Scanner(System.in)) {
// // // System.out.print("Enter a number to print the table: ");
// // // int num = sc.nextInt();
// // // int i = 1;
// // // do {
// // // System.out.println(num + " * " + i + " = " + (num * i));
// // // i++;
// // // } while (i <= 10);
// // // }
// // // }
// // // }

// // // Wwrite a program that take 2 integers, N & M as input & calculates their
// // factorials using a do-while loop.

// // import java.util.Scanner;

// // public class Loops{
// // public static void main(String[] args) {
// // Scanner sc = new Scanner(System.in);
// // System.out.print("Enter a number to find the factorial of N:");
// // int N = sc.nextInt();
// // System.out.print("Enter a number to find the factorial of M:");
// // int M = sc.nextInt();
// // int factorialN = 1;
// // int factorialM = 1;
// // int i = 1;
// // do{
// // factorialN *= i;
// // i++;
// // }while(i <= N);
// // System.out.println("The factorial of " + N + " is : " + factorialN);

// // i = 1;
// // do{
// // factorialM *= i;
// // i++;
// // }while(i <= M);
// // System.out.println("The factorial of " + M + " is : " + factorialM);
// // }
// // }

// // Nested Loops in Java.//////////
// // public class Loops {
// // public static void main(String[] args) {
// // for (int row = 1; row <= 5; row++) {
// // for (int col = 1; col <= 5; col++) {
// // System.out.print("Present ");
// // }
// // System.out.println(); // Move to the next line after each row
// // }
// // }
// // }

// // Write a program to clean the dirt from your clothes user has given you a
// // dirty cloth you can remoove only 10 points of dart as once you need to clear
// // a while loop untill the dirt becomes 0 on the cloth.
// public class Loops{
//     public static void main(String[] args) {
//         int clothDirt = 100; // Initial dirt on the cloth
//         while(clothDirt > 0) {
//             clothDirt -= 10; // Remove 10 points of dirt
//             System.out.println("Removed 10 points of dirt. Remaining dirt: " + clothDirt);
//         }
//     }
// }
