package week7hwharshitpatel;
/*Write a program that tells us input value is number or an alphabet or symbol*/

import java.util.Scanner;

public class LLCharCheck {

    public static void charchck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter any Character :  ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("You have entered an ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println("You have entered a DIGIT.");

        } else {

            System.out.println("You have entered a SPECIAL CHARACTER.");
        }

    }

    public static void main(String[] args) {
        charchck();
    }
}