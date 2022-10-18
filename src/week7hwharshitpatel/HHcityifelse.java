package week7hwharshitpatel;
/*. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class HHcityifelse {
    public static void main(String[] args) {
        cityname();
    }

    public static void cityname() {
        Scanner scanner = new Scanner(System.in);
        char grade;
        System.out.println("Enter A to E:");
        grade = scanner.next().charAt(0);
        scanner.close();

        if (grade == 'A' || grade == 'a') {
            System.out.println("Ahmedabad");
        } else if (grade == 'B' || grade == 'b') {
            System.out.println("Bangalore");
        } else if (grade == 'C' || grade == 'c') {
            System.out.println("Calcutta");
        } else if (grade == 'D' || grade == 'd') {
            System.out.println("Delhi");
        } else if (grade == 'E' || grade == 'e') {
            System.out.println("Eklera");
        } else if (grade == 'F' || grade == 'f') {
            System.out.println("Farihabad");
        } else {
            System.out.println("Invalid input");
        }
    }
}
