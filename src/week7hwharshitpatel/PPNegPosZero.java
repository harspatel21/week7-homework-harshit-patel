package week7hwharshitpatel;
/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*/

import java.util.Scanner;

public class PPNegPosZero {
    public static void value() {
        int A;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        A = scan.nextInt();
        scan.close();

        if (A < 0) {
            System.out.println("This is Negative Number");
        } else if (A > 0) {
            System.out.println("This is Positive number");
        } else {
            System.out.println("This is Zero");
        }
    }


    public static void main(String[] args) {

        value();
    }
}
