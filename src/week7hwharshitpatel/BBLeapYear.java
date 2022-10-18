package week7hwharshitpatel;
/*2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?*/

import java.util.Scanner;

public class BBLeapYear {
    public static void leapyear() {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter year: ");
        x = scanner.nextInt();
        if (x % 4 == 0) {
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is not a Leap Year");
            scanner.close();
        }
    }

    public static void main(String[] args) {

        leapyear();
    }

}
