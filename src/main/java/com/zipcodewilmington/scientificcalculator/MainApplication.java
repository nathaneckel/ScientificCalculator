package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);

        double userInput = 0;
        double userInputTwo = 0;
        String operator;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userInput = scanner.nextDouble();
        System.out.print("Enter an operator: ");
        operator = scanner.next();
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            System.out.print("Enter another number: ");
            userInputTwo = scanner.nextDouble();
        }

        double result;
        switch (operator) {

            // add
//            case "+":
//                result = ScientificCalculations.add(userInput, userInputTwo);
//                System.out.println(result);
//                break;

            // sine
            case "sine":
                result = ScientificCalculations.sine(userInput);
                System.out.println(result);
                break;

            case "cosine":
                result = ScientificCalculations.cosine(userInput);
                System.out.println(result);
                break;

            case "tangent":
                result = ScientificCalculations.sine(userInput);
                System.out.println(result);
                break;

            case "inverseSine":
                result = ScientificCalculations.inverseSine(userInput);
                System.out.println(result);
                break;

            case "inverseCosine":
                result = ScientificCalculations.inverseCosine(userInput);
                System.out.println(result);
                break;

            case "inverseTangent":
                result = ScientificCalculations.inverseTangent(userInput);
                System.out.println(result);
                break;

            case "log":
                result = ScientificCalculations.log(userInput);
                System.out.print(result);
                break;

            case "inverseLog":
                result = ScientificCalculations.inverseLog(userInput);
                System.out.print(result);
                break;

            case "naturalLog":
                result = ScientificCalculations.naturalLog(userInput);
                System.out.print(result);
                break;

            case "eX":
                result = ScientificCalculations.eX(userInput);
                System.out.print(result);
                break;

        }
        scanner.close();
    }
}

//    public static double getUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(0);
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }


