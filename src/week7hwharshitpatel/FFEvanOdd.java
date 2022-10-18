package week7hwharshitpatel;
// Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class FFEvanOdd {

    public void evanodd() {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any value: ");
        x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is an even Number");
        } else {
            System.out.println(x + " is an odd Number");

        }
        scanner.close();

    }

    public static void main(String[] args) {
        FFEvanOdd obj = new FFEvanOdd();
        obj.evanodd();

    }
}
