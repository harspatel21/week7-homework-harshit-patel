package week7hwharshitpatel;
/*1. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class AAOddEven {
    public void oddeven() {
        int x;
        String y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any value: ");
        x = scanner.nextInt();
        y = x % 2 == 0 ? "Even" : "Odd";
        System.out.println("You have entered " + y + " number");
        scanner.close();

    }

    public static void main(String[] args) {
        AAOddEven obj = new AAOddEven();
        obj.oddeven();

    }
}
