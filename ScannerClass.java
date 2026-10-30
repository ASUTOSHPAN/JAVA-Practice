//Taking user input using scanner class///////////

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd number: ");
            int num2 = sc.nextInt();
            add(num1, num2);
        }
    }

    static void add(int a, int b) {
        System.out.println("The sum of " + a + " & " + b + " is " +(a + b)); //The sum of 12 & 12 is 24.
    }
}