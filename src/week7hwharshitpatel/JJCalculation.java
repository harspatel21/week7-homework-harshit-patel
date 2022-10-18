package week7hwharshitpatel;
/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
*/

import java.util.Scanner;

public class JJCalculation {

    public static void calculation() {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter the operator you want(+, -, *, /) :");
        ch = scan.next().charAt(0);
        scan.close();

        if (ch == '+') {
            System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Substraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (ch == '/') {
            System.out.print("Division of " + num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.print("Operator is not available");
        }

    }

    public static void main(String[] args) {
        calculation();
    }

}
