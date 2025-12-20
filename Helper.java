/*
 *  This class has all the functions that help our main calculator.
 *  But these code blocks are not very specific to what the main code base does.
 *
 *  therefore this separate class is made.
 */

import java.util.StringTokenizer;

public class Helper {
    public Helper() {

    }

    /*
     *
     * If we give every possible operator a number assigned to it like, '-' -> 1,
     * '+' -> 2,
     * '*' -> 3 and '/' -> 4, then rankOfOperator() just returns the number
     * assigned.
     */
    public static int rankOfOperator(char operator) {
        if (operator == '/') {
            return 4;
        } else if (operator == '*') {
            return 3;
        } else if (operator == '+') {
            return 2;
        } else {
            return 1;
        }
    }
    public static Double calculate(double num1, double num2, char operator) {


        double result = 0.0;
        if (operator == '/') {
            result =  num1 / num2;
        } else if (operator == '*') {
            result =  num1 * num2;
        } else if (operator == '+') {
            result =  num1 + num2;
        } else {
            result =  num1 - num2;
        }


        return result;
    }
}
