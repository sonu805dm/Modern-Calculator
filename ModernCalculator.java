import java.util.Scanner;
import java.util.StringTokenizer;

public class ModernCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the equation (the equation must be mathematically, correct without brackets and off, and must end with '=' sign): ");
        String equation = sc.nextLine();

        // filtering the equation
        equation = equation.replace(" ", "");
        equation = equation.replace("=", "");

        String simpleEquation = solve(equation);
        System.out.println(simpleEquation);
    }

    /*
     * If an equation can be divided into smaller and simple equation,
     * then we must solve the equation that comes at the top by DAMS rule.
     *
     * For example lets check equation "3-2+1",
     * this can be divided into simple equations like "3-2" and "2+1",
     * and by the rules we must solve "2+1". Hence, solve() returns the equation "2+1".
     */


    static String solve(String equation) {
        StringTokenizer st = new StringTokenizer(equation, "-+*/");
        int tokens = st.countTokens(); // value of tokens is just the number of numbers in the equation

        int maxRankOperator = 1;
        char currentOperator = ' ';

        String prev = "", next = "";

        String number = st.nextToken();
        int i = 0;
        i += number.length();
        while (st.hasMoreTokens()) {

            char operator = equation.charAt(i);
            int rank = Helper.rankOfOperator(operator);

            if (maxRankOperator <= rank) {
                maxRankOperator = rank;

                currentOperator = operator;

                prev = number;
                number = st.nextToken();
                next = number;

                i += number.length() + 1;

                continue;
            }

            number = st.nextToken();

            i += number.length() + 1;
        }

        return prev + (char) currentOperator + next;

    }

}