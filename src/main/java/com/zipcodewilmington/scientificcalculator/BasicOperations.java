package com.zipcodewilmington.scientificcalculator;

public class BasicOperations {

    // SIMPLE FUNCTIONS
    public static double add(double userInput, double userInputTwo) {
        return userInput + userInputTwo;
    }
    public static double subtract(double userInput, double userInputTwo) {
        return userInput - userInputTwo;
    }
    public static double multiply(double userInput, double userInputTwo){
        return userInput * userInputTwo;
    }
    public static double divide(double userInput, double userInputTwo){
        return userInput / userInputTwo;
    }


    //SQUARE
    public static double square(double userInput){
        return userInput * userInput;
    }
    //ALT FOR SQUARE
    public static double square2(double userInput){
        return Math.pow(userInput, 2);
    }

    public static double squareRoot(double userInput){
        return Math.sqrt(userInput);
        }

    public static double variableExponent(double userInput, double userInputTwo){
         return Math.pow(userInput, userInputTwo);
        }

    public static double inverseNumber(double userInput) {
        return 1/userInput;
    }

    public static double modulo(double userInput, double userInputTwo) {
        return userInput % userInputTwo;

    }
}
