// // // // // // //Break Statements.////
// // // // // // //A warehouse has items from 1 to 10. You need to search for the item
// // // // // number
// // // // // // 6. Once you find it, you stop the search.
// // // // // // public class Jump {
// // // // // // public static void main(String[] args) {
// // // // // // for(int item = 1; item <= 10; item++) {
// // // // // // System.out.println(item);
// // // // // // if(item == 6) {
// // // // // // System.out.println("Item " + item + " found, stop search.");
// // // // // // break;
// // // // // // }
// // // // // // }
// // // // // // }
// // // // // // }

// // // // // // write a Java Program that reads an integer N and prints all numbers from 1
// // // // // to N.
// // // // // // However, if any number in this range is divisible by 5, stop printing
// // // // // further numbers.
// // // // // import java.util.Scanner;
// // // // // public class Jump {
// // // // // public static void main(String[] args) {
// // // // // try (Scanner sc = new Scanner(System.in)) {
// // // // // System.out.print("Enter a number: ");
// // // // // int N = sc.nextInt();
// // // // // for (int i = 1; i <= N; i++) {
// // // // // if (i % 5 == 0) {
// // // // // break;
// // // // // }
// // // // // System.out.println("i: " + i);
// // // // // }
// // // // // }
// // // // // }
// // // // // }

// // // // // You are building a simple application to calculate the sum of all numbers
// // // // // from 1 to 10, but you want to skip adding the numbers that are multiple of 3.
// // // // public class Jump{
// // // //     public static void main(String[]args) {
// // // //         int sum = 0;
// // // //         for(int i = 1; i <= 10; i++) {
// // // //             if (i % 3 == 0) {
// // // //                 System.out.println("Number " + i + " skipped.");
// // // //                 continue;
// // // //             }
// // // //             sum = sum + i;
// // // //             System.out.println(sum);
// // // //         }
// // // //     }
// // // // }

// // // //Write a Java program to prints All numbers from 1 to N, skipping multiples 3 & 5.
// // // import java.util.Scanner;
// // // public class Jump {
// // //     public static void main(String[] args) {
// // //         try(Scanner sc= new Scanner(System.in)) {
// // //             System.out.print("Enter a number: ");
// // //             int num = sc.nextInt();
// // //             for(int i = 1; i <= num; i++) {
// // //                 if(i % 3 == 0 || i % 5 == 0) {
// // //                     System.out.println("Number " + i + " skipped.");
// // //                     continue;
// // //                 }
// // //                 System.out.println(i);
// // //             }
// // //         }
// // //     }
// // // }

// // //Print all odd numbers in a given range.///// Question
// // import java.util.Scanner;
// // public class Jump{
// //     public static void main(String[] args) {
// //         try(Scanner sc = new Scanner(System.in)) {
// //             System.out.print("Enter a number: ");
// //             int num = sc.nextInt();
// //             for(int i = 1; i <= num; i++) {
// //                 if(i % 2 == 0) {
// //                     // System.out.println();
// //                     continue;
// //                 }
// //                 System.out.println(i );
// //             }
// //         }
// //     }
// // }

// //Java program to calculate & print the sum of Numbers from 1 to N Skipping Multiplies of 4./// Question
// import java.util.Scanner;
// public class Jump {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();
//             int sum = 0;
//             for (int i = 1; i <= num; i++) {
//                 if (i % 4 == 0) {
//                     System.out.println("The number " + i + " is Skipped.");
//                     continue;
//                 }
//                 sum += i * i;
//             }
//             System.out.println("The sum of squares from 1 to " + num + " is: " + sum);
//         }
//     }
// }