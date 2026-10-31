// // //Taking user input using scanner class///////////

// //  import java.util.Scanner;

// // // public class ScannerClass {
// // //     public static void main(String[] args) {
// // //         try (Scanner sc = new Scanner(System.in)) {
// // //             System.out.println("Enter first number:");
// // //             int num1 = sc.nextInt();
// // //             System.out.println("Enter 2nd number: ");
// // //             int num2 = sc.nextInt();
// // //             add(num1, num2);
// // //         }
// // //     }

// // //     static void add(int a, int b) {
// // //         System.out.println("The sum of " + a + " & " + b + " is " +(a + b)); //The sum of 12 & 12 is 24.
// // //     }
// // // }

// // // Calculating & Returning the Square of an Integer in Java. ///////
// // public class ScannerClass {
// //     public static void main(String[] args) {
// //         try (Scanner sc = new Scanner(System.in)) {
// //             System.out.println("Enter a number to find its square: ");
// //             int num = sc.nextInt();
// //             int result = square(num);
// //             System.out.println(result);
// //         }
// //     }
// //     public static int square(int a) {
// //         return a * a;
// //     }
// // }



// // How to write a sentence. ///////////////
// import java.util.Scanner;
// public class ScannerClass {
//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter a word");
//             String a = sc.next();
//             System.out.println("You entred : " + a);
//             sc.nextLine();
//             System.out.println("Enter a sentence.");
//             String b = sc.nextLine();
//             System.out.println(b);
//         }
//     }
// }



//Retrieving the first character of a string. //////////
import java.util.Scanner;
/**
 * ScannerClass
 */
public class ScannerClass {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            char a = sc.next().charAt(0);
            System.out.println(a);
        }
    }
}