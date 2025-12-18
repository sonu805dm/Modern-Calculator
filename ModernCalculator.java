import java.util.Scanner;
import java.util.StringTokenizer;

public class ModernCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the equation (the equation must be mathematically correct and must end with '=' sign): ");
        String equation = sc.nextLine();

        // filtering the equation
        equation = equation.replace(" ", "");
        equation = equation.replace("=", "");

    }
}