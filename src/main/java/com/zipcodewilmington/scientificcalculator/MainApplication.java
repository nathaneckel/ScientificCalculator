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
        double result;
        String operator;
        String power;


        System.out.println("Select a number to call an operation");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square");
        System.out.println("6. Square Root");
        System.out.println("7. Exponent");
        System.out.println("8. Inverse");
        System.out.println("9. Toggle to inverse(+/-)");
        System.out.println("10. Sine");
        System.out.println("11. Cosine");
        System.out.println("12. Tangent");
        System.out.println("13. Inverse Sine");
        System.out.println("14. Inverse Cosine");
        System.out.println("15. Inverse Tangent");
        System.out.println("16. Logarithm");
        System.out.println("17. Inverse Logarithm");
        System.out.println("18. Natural Logarithm");
        System.out.println("19. Inverse Natural Logarithm");

        operator = scanner.nextLine();
        if (operator.equals("20")) {
            userInputFactorial = scanner.nextInt();
        }
        System.out.print("Enter a number: ");
        userInput = scanner.nextDouble();
        if (operator.equals("1") || operator.equals("2") || operator.equals("3") || operator.equals("4")) {
            System.out.print("Enter another number: ");
            userInputTwo = scanner.nextDouble();
        }
//        System.out.println("Continue? Y/N");
//        power = scanner.nextLine();
//        if (power.equals("N")) {
//            isOn = false;
//        }
//    do {
        switch (operator) {

            // add
            case "1":
                result = BasicOperations.add(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "2":
                result = BasicOperations.subtract(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "3":
                result = BasicOperations.multiply(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "4":
                result = BasicOperations.divide(userInput, userInputTwo);
                System.out.println(result);
                break;

            case "5":
                result = BasicOperations.square(userInput);
                System.out.println(result);
                break;

            case "6":
                result = BasicOperations.square2(userInput);
                System.out.println(result);
                break;

            case "7":
                result = BasicOperations.squareRoot(userInput);
                System.out.println(result);
                break;

            case "8":
                result = BasicOperations.variableExponent(userInput, userInputTwo);
                System.out.println(result);

            case "9":
                result = BasicOperations.inverseNumber(userInput);
                System.out.println(result);

            case "10":
                result = ScientificCalculations.sine(userInput);
                System.out.println(result);
                break;

            case "11":
                result = ScientificCalculations.cosine(userInput);
                System.out.println(result);
                break;

            case "12":
                result = ScientificCalculations.sine(userInput);
                System.out.println(result);
                break;

            case "13":
                result = ScientificCalculations.inverseSine(userInput);
                System.out.println(result);
                break;

            case "14":
                result = ScientificCalculations.inverseCosine(userInput);
                System.out.println(result);
                break;

            case "15":
                result = ScientificCalculations.inverseTangent(userInput);
                System.out.println(result);
                break;

            case "16":
                result = ScientificCalculations.log(userInput);
                System.out.print(result);
                break;

            case "17":
                result = ScientificCalculations.inverseLog(userInput);
                System.out.print(result);
                break;

            case "18":
                result = ScientificCalculations.naturalLog(userInput);
                System.out.print(result);
                break;

            case "19":
                result = ScientificCalculations.eX(userInput);
                System.out.print(result);
                break;

            case "20":
                result = ScientificCalculations.factorial(userInputFactorial);
                System.out.print(result);
                break;
        }
    }
    }


