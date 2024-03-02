package com.zipcodewilmington.scientificcalculator;

public class BasicOperations {

    //Nick's example that I'm customizing - TY Nick!

    //HERE's WHAT [UPDATE: NICK & I] NEED TO DO:
    /*
     DEFAULT 0 DISPLAY STATE.
     GET/DISPLAY CURRENT NUMBER
     CLEAR THE DISPLAY
     CHANGE THE NUMBER ON THE DISPLAY
     ADD SUBTRACT MULTIPLY AND DIVIDE THE DISPLAY VALUE BY A GIVEN NUMBER

    I NEED TO DO THIS
    - SIMPLE FUNCTIONS~~
    - SQUARE / SQUARE ROOT OF DISPLAY NUMBER
    - VARIABLE EXPONENTIATION (Xy)
    - INVERSE OF DISPLAY NUMBER (1/X)
    5 INVERT THE SIGN OF NUMBER (TOGGLE +/-)
    6 DISPLAY "ERROR" WHEN ERROR
    7 CLEAR THE ERROR BEFORE YOU CAN DO ANYTHING ELSE

    NATHAN CUSTOMIZE NICK'S CODE BELOW AND FIGURE THE CONTEXT WHERE IT FITS IN

    */
    // SIMPLE FUNCTIONS
    public static double add(double userInput) {
        return x + y;
    }
    public static double subtract(double userInput){
        return x - y;
    }
    public static double multiply(double userInput){
        return x * y;
    }
    public static double divide(double userInput){
        return x / y;
    }
   /* SQUARE
int i = 2;
int square = Math.pow(i, 2);

    //SQUARE ROOT
    // Java program to demonstrate working
// of java.lang.Math.sqrt() method

    /*import java.lang.Math;

    class Gfg {

        // driver code
        public static void main(String args[])
        {
            double a = 30;

            System.out.println(Math.sqrt(a));

            a = 45;


    //VARIABLE EXPONENTIATION (Xy)
    X in terms of Y -
    How do you declare an exponential in Java?
    It takes two arguments: the base and the exponent,
    and returns the result as a double, with the syntax double result
    = Math. pow(base, exponent); .

    For instance, Math. pow(2, 3) raises 2 to the power of 3.

    //INVERSION / INVERSE OF DISPLAY NUMBER
    /*How do you find the inverse of a number in Java?
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        int sum=0;
        int temp=num;
        int count=0;
        while (temp!=0)
        {
            temp=temp/10;
            count=count+1;
        }
        int i=1;
        while (i<=count)
        {
            int d= num%10;
            int y= i*(int)Math.pow(10,d-1);
            sum = sum+y;
            num=num/10;
            i++;

        }
        System.out.println(sum);


    }
}

INVERSE THE SIGN OF A NUMBER
#toggle?  if/else? if + is false, then - ; if - is false then +

How to change the sign of a number in js?
sign() method retuns whether a number is negative, positive or zero.
If the number is positive, this method returns 1.
If the number is negative, it returns -1.
If the number is zero, it returns 0.

DISPLAY ERROR
How to print out an error in Java?
Different ways to print exception messages in Java
Using printStackTrace() method − It print the name of the exception, description and complete stack trace including the line where exception occurred. ...
Using toString() method − It prints the name and description of the exception. ...
Using getMessage() method − Mostly used.

CLEAR ERROR BEFORE I CAN DO ANYTHING
How to clear printed text in Java?
To clear a line of output from a Java program's screen, you can use the following methods:
Use System.out.print("\r") to move the cursor back to the beginning of the line, then use System.out.print(" ") to print a space character in each position on the line. ...
Use System.out.print("\033[2K") to clear the line.

OR https://stackoverflow.com/questions/24786986/do-you-need-system-out-flush-before-system-error-print
     */

    }
}
