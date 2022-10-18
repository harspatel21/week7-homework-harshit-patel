package week7hwharshitpatel;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class GGCommission {

    public static void commission() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Employee ID: ");
        int selid = scanner.nextInt();
        System.out.print("Please enter Employee Name: ");
        String selname = scanner.next();
        System.out.print("Please enter Sales Amount: ");
        double selamount = scanner.nextDouble();
        System.out.print("Please enter Employee Salary : ");
        double salesalery = scanner.nextDouble();
        scanner.close();
        double commission;
        if (selamount >= 50000) {
            commission = selamount * 0.35;
            System.out.println("Commission 35% : " + commission);
            System.out.println("Total Salary: " + (salesalery + commission));
        } else if (selamount >= 30000 && selamount < 50000) {
            commission = selamount * 0.20;
            System.out.println("Commission 20% : " + commission);
            System.out.println("Total Salary: " + (salesalery + commission));
        } else if (selamount >= 20000 && selamount < 30000) {
            commission = selamount * 0.10;
            System.out.println("Commission 10% : " + commission);
            System.out.println("Total Salary: " + (salesalery + commission));
        } else if (selamount >= 10000 && selamount < 20000) {
            commission = selamount * 0.05;
            System.out.println("Commission 5% : " + commission);
            System.out.println("Total Salary: " + (salesalery + commission));

        } else if (selamount >= 1 && selamount < 10000) {
            commission = selamount * 0.02;
            System.out.println("Commission 2% : " + commission);
            System.out.println("Total Salary: " + (salesalery + commission));
        } else {
            commission = 0;
            System.out.println("No Commission : " + commission);
            System.out.println("Total Salary: " + (salesalery + commission));

        }

    }

    public static void main(String[] args) {
        commission();
    }

}
