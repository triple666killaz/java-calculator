package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double firstNumber;
        double secondNumber;
        char operation;

        System.out.println("Insert your values and operation in this order :" +
                "\nfirst value -> operation symbol -> second value (e.g. 6 -> * -> 7)");

        while (true) {

            firstNumber = 0;
            secondNumber = 0;
            operation = 0;

            try {

                firstNumber = scanner.nextDouble();
                operation = scanner.next().charAt(0);
                secondNumber = scanner.nextDouble();
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input");

            } finally {
                System.out.println("Result is "
                        + calculator.makeCalculation(firstNumber, secondNumber, operation));

            }
        }


    }
}
