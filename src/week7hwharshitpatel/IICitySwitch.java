package week7hwharshitpatel;
/*. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
Using Switch Statement
 */

import java.util.Scanner;

public class IICitySwitch {

    public static void cityname() {

        Scanner scanner = new Scanner(System.in);
        String grade;
        System.out.print("Enter A to E:");
        grade = scanner.next();
        scanner.close();


        switch (grade) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bangalore");
                break;
            case "b":
                System.out.println("Bangalore");
                break;

            case "C":
                System.out.println("Calcutta");
                break;
            case "c":
                System.out.println("Calcutta");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Elenor");
                break;
            case "e":
                System.out.println("Elenor");
                break;
            case "f":
                System.out.println("Elenor");
                break;
            case "F":
                System.out.println("Faridabad");
                break;

            default:
                System.out.println("Invalid input");
        }

    }

    public static void main(String[] args) {

        cityname();
    }
}
