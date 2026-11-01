// // // // // check the number is multiple of 5 or not ? /////////
// // // // import java.util.Scanner;
// // // // public class Control {
// // // //     public static void main(String[] args) {
// // // //         Scanner sc = new Scanner(System.in);
// // // //         System.out.println("Enter a number to check the number is multiple of 5 or not.");
// // // //         int num = sc.nextInt();
// // // //         CheckMultipleofFive(num);
// // // //     }
// // // //     public static void CheckMultipleofFive(int num) {
// // // //         if (num % 5 == 0) {
// // // //             System.out.println("The number is multiple of Five.");
// // // //         }
// // // //         System.out.println("Program ended.");
// // // //     }
// // // // }

// // // //Check the number is even or odd. ////////
// // // import java.util.Scanner;
// // // public class Control {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.println("Enter a number to check Even or odd.");
// // //         int num = sc.nextInt();
// // //         checkEvenOdd(num);
// // //     }
// // //     public static void checkEvenOdd(int num) {
// // //         if (num % 2 == 0) {
// // //             System.out.println("The number is even.");
// // //         } else {
// // //             System.out.println("The number is odd.");
// // //         }
// // //     }
// // // }

// // //Check the number is positive, negative or Zero. ////////
// // import java.util.Scanner;

// // public class Control {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number to check the number is positive, negative or zero.");
// //         int number = sc.nextInt();
// //         if (number > 0) {
// //             System.out.println("Positive");
// //         } else if (number < 0) {
// //             System.out.println("Negative");
// //         } else {
// //             System.out.println("Zero");
// //         }
// //     }
// // }

// //Swithch Statement in Java. ////////
// import java.util.Scanner;
// public class Control {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the day:");
//         int day = sc.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thurssday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//                 break;
//         }
//     }
// }

//Simple Calculatorin Java. ////////
import java.util.Scanner;
public class Control {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the Operator:");
        char operator = sc.next().charAt(0);
        Calculate(num1, num2, operator);
        }  
    }

    public static void Calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            default: System.out.println("Invalid Operator");
                break;
        }
    }
}