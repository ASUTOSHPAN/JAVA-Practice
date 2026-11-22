
// //1. Develop a java application to check if a given number is Positive,
// Negative / Zero.
// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         System.out.print("Enter a number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num < 0) {
//             System.out.println("The number is negative.");
//         } else if (num > 0) {
//             System.out.println("The number is positive.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//     }
// }

// //2. Develope a java application to find the sum of squares for the first n natural numbers.
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         System.out.print("Enter a number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             sum = sum + (i * i);
//         }
//         System.out.println("The sum of squares for the first " + num + " natural numbers is: " + sum);
//         sc.close();
//     }
// }

// 3. Develope a java application to find the Sum of first 50 Naturals numbers.
// public class Practice {
//     public static void main(String[] args) {
//         int num = 50;
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             sum += i;
//         }
//         System.out.println("The sum of first 50 natural numbers is: " + sum);
//     }
// }

// // 4. Develope a Java Program to reverse a given number.
// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         System.out.print("Enter numbers to reverse: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int reverse = 0;
//         while (num > 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }
//         System.out.print(reverse);
//     }
// }

// // 5. Develope a Java programme to check if a given number is a Prime Number
// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         boolean isPrime = true;
//         if (num <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if (isPrime) {
//             System.out.println(num + " is a Prime number.");
//         } else {
//             System.out.println(num + " is not a Prime number.");
//         }
//     }
// }

// // 6. Develop a Java program to print all Prime numbers in a given range.
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the start number: ");
//         int startNum = sc.nextInt();
//         System.out.print("Enter end number: ");
//         int endNum = sc.nextInt();
//         for (int num = startNum; num <= endNum; num++) {
//             if (num <= 1) {
//                 continue;
//             } else {
//                 boolean isPrime = true;
//                 for (int i = 2; i <= num / 2; i++) {
//                     if (num % i == 0) {
//                         isPrime = false;
//                         break;
//                     }
//                 }
//                 if (isPrime) {
//                     System.out.println("Num: " + num);
//                 }
//             }
//         }
//         sc.close();
//     }
// }

// 7.Develop a Java Program to calculate the Factorial of a given non-negative integer.
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int factorial = 1;
//         if (num < 0) {
//             System.out.println("The factorial is not defined for negative numbers.");
//         } else {
//             for (int i = 1; i <= num; i++) {
//                 factorial *= i;
//             }
//             System.out.println("The factorial of " + num + " is " + factorial + ".");
//         }
//         sc.close();
//     }
// }

// 8. Develop a simple Java program to find the n-th term of the series 1, 3, 6, 10, 15, 21...
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int nthTerm = num * (num + 1) / 2;
//         System.out.println("The " + num + "th term of the series is " + nthTerm + ".");
//     }
// }

// // 9. Print N-numbers of Fibonacci series.
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int fib1 = 0;
//         int fib2 = 1;
//         int fib3;
//         for (int i = 1; i <= n; i++) {
//             fib3 = fib1 + fib2;
//             System.out.print(fib1 + " ");
//             fib1 = fib2;
//             fib2 = fib3;
//         }
//     }
// }

// 10. You need to Print the Sum of all odd numbers between 1 to n.
//import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 sum += i;
//             }
//         }
//         System.out.print("The sum of all odd numbers from 1 to " + n + " is: " + sum);
//     }
// }

// 11. Write a Java Program that calculates the sum of digits of a given integer.
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int sum = 0;
//         while (num != 0) {
//             sum = sum + (num % 10);
//             num = num / 10;
//         }
//         System.out.println("Sum of digits: " + sum);
//         sc.close();
//     }
// }

// 12. Write a Java program to find the nth Fibonacci number.
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int fib1 = 0;
//         int fib2 = 1;
//         int fib3 = 0;
//         if (n == 0) {
//             System.out.println("The " + n + "th number of Fibonacci number is " + fib1);
//         } else if (n == 1) {
//             System.out.println("The " + n + "th number of Fibonacci number is " + fib2);
//         } else {
//             for (int i = 2; i <= n; i++) {
//                 fib3 = fib1 + fib2;
//                 fib1 = fib2;
//                 fib2 = fib3;
//             }
//             System.out.println("The " + n + "th Fibonacci number is " + fib3);
//         }
//         sc.close();
//     }
// }

//13. Print the Cube of the first n natural numbers.
// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         for (int i = 1; i <= num; i++) {
//             System.out.println("The cube of " + i + " is: " + (i * i * i));
//         }
//         sc.close();
//     }
// }


// 14. Print the Square of the first n natural numbers.
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             System.out.println("The square of " + i + " is: " + (i * i));
//         }
//         sc.close();
//     }
// }

