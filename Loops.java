// // // //For-loop in Java./////////
// // // // // // //Sum of natural numbers 1 to 10 ////////////
// // // // // // public class Loops {
// // // // // //     public static void main(String[] args) {
// // // // // //         int sum = 0;
// // // // // //         for(int i = 1; i <= 10; i++) {
// // // // // //             sum += i;  
// // // // // //         }
// // // // // //         System.out.println("The sum of the 1st ten natural numbers is " + sum);
// // // // // //     }
// // // // // // }

// // // // // //Calculating the sum of First N natural numbers in Java. ////////
// // // // // import java.util.Scanner;
// // // // // public class Loops {
// // // // //     public static void main(String[] args) {
// // // // //         Scanner sc = new Scanner(System.in);
// // // // //         System.out.println("Enter a number to find the sum of first N natural numbers: ");
// // // // //         int num = sc.nextInt();
// // // // //         int sum = 0;
// // // // //         for(int i = 1; i <= num; i++) {
// // // // //             sum += i;
// // // // //         }
// // // // //         System.out.println("The sum of 1st N numbers is: " + sum);
// // // // //     }
// // // // // }

// // // // // Counting down with a for loop in Java. ////////
// // // // import java.util.Scanner;
// // // // public class Loops {
// // // //     public static void main(String[] args) {
// // // //         System.out.println("Enter a number to count down from: ");
// // // //         Scanner sc = new Scanner(System.in);
// // // //         int num = sc.nextInt();
// // // //         for(int i = num; i >= 0; i--) {
// // // //             System.out.println(i);
// // // //         }
// // // //     }
// // // // }

// // // //While Loop in Java.//////
// // // //Calculate the factorial of a given number.
// // // import java.util.Scanner;

// // // public class Loops {
// // //     public static void main(String[] args) {
// // //         System.out.println("Enter a number to find the factorial: ");
// // //         try (Scanner sc = new Scanner(System.in)) {
// // //             int num = sc.nextInt();
// // //             int factorial = 1;
// // //             int i = 1;
// // //             while (i <= num) {
// // //                 factorial = factorial * i;
// // //                 i++;
// // //             }
// // //             System.out.println("The factorial of " + num + " is: " + factorial);
// // //         }
// // //     }
// // // }



// // //Print even numbers from 1 to N using while loop.
// // import java.util.Scanner;
// // public class Loops {
// //     public static void main(String[] args) {
// //         System.out.println("Enter a number: ");
// //         try(Scanner sc = new Scanner(System.in)) {
// //             int num = sc.nextInt();
// //             while (num > 0) {
// //                 if(num % 2 == 0) {
// //                     System.out.println("The even number is: " + num);
// //                 }
// //                 num--;
// //             }
// //         }
// //     }
// // }


// //Write a program that prints all the numbers N to 1 using while loop. ////////
// import java.util.Scanner;
// public class Loops {
//     public static void main(String[] args) {
//         System.out.println("Enter a number: ");
//         try(Scanner sc = new Scanner(System.in)){
//             int num = sc.nextInt();
//             // int i = 1;
//             while(num > 0) {
//                 System.out.println(num);
//                 num--;
//             }
//         }
//     }
// }

