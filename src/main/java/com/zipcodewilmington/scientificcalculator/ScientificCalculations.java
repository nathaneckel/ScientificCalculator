package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
public class ScientificCalculations {
//    public static double getUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(0);
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }

//    public static double add(double userInput, double userInputTwo) {
//        return userInput + userInputTwo;
//    }
    // Trigonometry Functions

    public static double sine(double userInput) {
        userInput = Math.toRadians(userInput);
        return Math.sin(userInput);
    }

    public static double cosine(double userInput) {
        userInput = Math.toRadians(userInput);
        return Math.cos(userInput);
    }

    public static double tangent(double userInput) {
        userInput = Math.toRadians(userInput);
        return Math.tan(userInput);
    }

    public static double inverseSine(double userInput) {

        //        userInput = Math.toRadians(userInput);
        return Math.asin(userInput);
    }

    public static double inverseCosine(double userInput) {
//        userInput = Math.toRadians(userInput);
        return Math.acos(userInput);
    }

    public static double inverseTangent(double userInput) {
//        userInput = Math.toRadians(userInput);
        return Math.atan(userInput);
    }

    // Logarithmic Functions

    public static double log(double userInput) {
        return Math.log10(userInput);
    }

    public static double inverseLog(double userInput) {
        return Math.pow(10,userInput);
    }

    public static double naturalLog(double userInput) {
        return Math.log(userInput);
    }

    public static double eX(double userInput) {
        return Math.exp(userInput);
    }

    // Factorial and extra methods

    public static int factorial(int userInput) {
        int result = 1;

        for (int i = 1; i <= userInput; i++) {
            result = result * i;
        }
        return result;
    }


}
