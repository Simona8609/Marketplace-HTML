package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my first Calendar App");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("Add more...");

        System.out.println("Enter a valid operation number:");
        int operationType = scanner.nextInt();

        if (operationType == 1) {
            int additionResult = addition();
            System.out.println("additionResult = " + additionResult);
        } else if (operationType == 2) {
            // call subtraction method
        }


        int number1 = 10;
        int number2 = 8;
        number1 = number2;
        System.out.println(number1);
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);


        int quotient = 12 / 3;
        int remainder = 12 % 3;
        System.out.println("quotient is:" + quotient);
        System.out.println("remainder is " + remainder);

        int n1 = 15, n2 = 7;
        boolean isEqual = n1 == n2;
        boolean isNotEqual = n1 != n2;
        System.out.println(isNotEqual);
        System.out.println(isEqual);

        int age1 = 16;
        if (age1 >= 18) {
            System.out.println("You can drive a car");
        } else if (age1 < 18 && age1 >= 15) {
            System.out.println("You can drive a moped but not a car");
        }


    }

    public static int addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter a number:");
        int number2 = scanner.nextInt();

        int result = number1 + number2;
        return result;

    }

    // add other methods

}
