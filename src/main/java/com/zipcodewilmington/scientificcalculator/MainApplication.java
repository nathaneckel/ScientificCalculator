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
                "   |___________________________________________________________|\n\nSelect a number to call an operation");
//        System.out.println("1. Add");
//        System.out.println("2. Subtract");
//        System.out.println("3. Multiply");
//        System.out.println("4. Divide");
//        System.out.println("5. Square");
//        System.out.println("6. Square Root");
//        System.out.println("7. Exponent");
//        System.out.println("8. Inverse");
//        System.out.println("9. Toggle to inverse(+/-)");
//        System.out.println("10. Sine");
//        System.out.println("11. Cosine");
//        System.out.println("12. Tangent");
//        System.out.println("13. Inverse Sine");
//        System.out.println("14. Inverse Cosine");
//        System.out.println("15. Inverse Tangent");
//        System.out.println("16. Logarithm");
//        System.out.println("17. Inverse Logarithm");
//        System.out.println("18. Natural Logarithm");
//        System.out.println("19. Inverse Natural Logarithm");

        operator = scanner.nextLine();
        if (operator.equals("Fact")) {
            System.out.print("Enter a number: ");
            userInputFactorial = scanner.nextInt();
        }
        else {
            System.out.print("Enter a number: ");
            userInput = scanner.nextDouble();
            if (operator.equals("+") || operator.equals("-") || operator.equals("x") || operator.equals("÷") || operator.equals("EXP")) {
                System.out.print("Enter another number: ");
                userInputTwo = scanner.nextDouble();
            }
        }
//        System.out.println("Continue? Y/N");
//        power = scanner.nextLine();
//        if (power.equals("N")) {
//            isOn = false;
//        }
//    do {
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

            case "^":
                result = BasicOperations.square2(userInput);
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
                System.out.print(result);
                break;

            case "invLog":
                result = ScientificCalculations.inverseLog(userInput);
                System.out.print(result);
                break;

            case "ln":
                result = ScientificCalculations.naturalLog(userInput);
                System.out.print(result);
                break;

            case "eX":
                result = ScientificCalculations.eX(userInput);
                System.out.print(result);
                break;

            case "Fact":
                result = ScientificCalculations.factorial(userInputFactorial);
                System.out.print(result);
                break;
        }
    }
    }


