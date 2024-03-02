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

        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        double userInput = 0;
        double userInputTwo = 0;
        double result;
        String operator;
        

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

            System.out.print("Enter a number: ");
            userInput = scanner.nextDouble();
            System.out.print("Enter an operator: ");
            operator = scanner.next();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                System.out.print("Enter another number: ");
                userInputTwo = scanner.nextDouble();
            }

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


