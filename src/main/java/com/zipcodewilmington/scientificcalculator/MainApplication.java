package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        double userInput = 0;
        double userInputTwo = 0;
        int userInputFactorial = 0;
        double result = 0;
        String operator = "x";


        System.out.println(" \"\"\"\n" +
                "    ___________________________________________________________\n" +
                "   |  _______________________________________________________  |\n" +
                "   | |                                                       | |\n" +
                "   | |                                                       | |\n" +
                "   | |_______________________________________________________| |\n" +
                "   |                                                           |\n" +
                "   |  [(-)] [(_) ] [ * ] [  /  ] [ ^ ] [ √ ] [sin] [cos] [1/x] |\n" +
                "   |                                                           |\n" +
                "   |  [tan] [log] [ln] [π ] [eX] [arcSin] [arcCos] [arcTan]    |\n" +
                "   |                                                           |\n" +
                "   |  [ 7 ] [ 8 ] [ 9 ] [ ( ] [ ) ] [ x² ] [ x³ ] [EXP] [Fact] |\n" +
                "   |                                                           |\n" +
                "   |  [ 4 ] [ 5 ] [ 6 ] [ + ] [ - ] [ × ] [ ÷ ] [MOD] [invLog] |\n" +
                "   |                                                           |\n" +
                "   |  [ 1 ] [ 2 ] [ 3 ] [ 0 ] [ . ] [ = ] [AC]                 |\n" +
                "   |___________________________________________________________|\n\n");


    while(isOn) {
        System.out.print("Enter an operator: ");
        operator = scanner.nextLine();
        System.out.print("Enter a number: ");
        userInput = Double.parseDouble(scanner.nextLine());
        if (operator.equals("Fact")) {
            userInputFactorial = (int) (userInput);
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("x") || operator.equals("÷") || operator.equals("EXP")) {
            System.out.print("Enter another number: ");
            userInputTwo = Double.parseDouble(scanner.nextLine());
        }

        switch (operator) {

            // add
            case "+":
                result = BasicOperations.add(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "-":
                result = BasicOperations.subtract(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "x":
                result = BasicOperations.multiply(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "÷":
                result = BasicOperations.divide(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "x²":
                result = BasicOperations.square(userInput);
                System.out.println(result);
                break;


            case "√":
                result = BasicOperations.squareRoot(userInput);
                System.out.println(result);
                break;

            case "EXP":
                result = BasicOperations.variableExponent(userInput, userInputTwo);
                System.out.println(result);

            case "1/x":
                result = BasicOperations.inverseNumber(userInput);
                System.out.println(result);

            case "sin":
                result = ScientificCalculations.sine(userInput);
                System.out.println(result);
                break;

            case "cos":
                result = ScientificCalculations.cosine(userInput);
                System.out.println(result);
                break;

            case "tan":
                result = ScientificCalculations.tangent(userInput);
                System.out.println(result);
                break;

            case "arcSin":
                result = ScientificCalculations.inverseSine(userInput);
                System.out.println(result);
                break;

            case "arcCos":
                result = ScientificCalculations.inverseCosine(userInput);
                System.out.println(result);
                break;

            case "arcTan":
                result = ScientificCalculations.inverseTangent(userInput);
                System.out.println(result);
                break;

            case "log":
                result = ScientificCalculations.log(userInput);
                System.out.println(result);
                break;

            case "invLog":
                result = ScientificCalculations.inverseLog(userInput);
                System.out.println(result);
                break;

            case "ln":
                result = ScientificCalculations.naturalLog(userInput);
                System.out.println(result);
                break;

            case "eX":
                result = ScientificCalculations.eX(userInput);
                System.out.println(result);
                break;

            case "Fact":
                result = ScientificCalculations.factorial(userInputFactorial);
                System.out.println(result);
                break;

            case "Yes":
                return;

        }
        System.out.println("Would you like to continue? [Yes / No]");
        operator = scanner.nextLine();
            if (operator.equals("No")) {
                isOn = false;
            }
        }
    }
}


