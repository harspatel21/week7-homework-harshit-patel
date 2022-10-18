package week7hwharshitpatel;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|

 */

import java.util.Scanner;

public class EESalarySlip {

    public static void main(String[] args) {
        salary();

    }

    public static void salary() {
        String Empname;
        int Empid, Bsalary;


        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter Employee ID: ");
        Empid = scan.nextInt();
        scan.nextLine();
        System.out.print("Please enter Employee Name: ");
        Empname = scan.nextLine();
        System.out.print("Please enter Employee Basic Salary: ");
        Bsalary = scan.nextInt();
        int hra = (Bsalary * 10 / 100), ta = (Bsalary * 8 / 100), da = (Bsalary * 9 / 100), pf = (Bsalary * 8 / 100);
        int Gsalary = (Bsalary + hra + ta + da - pf);
        System.out.println("-------------------------------------------------------");
        System.out.println("|                 Salary Slip                          |");
        System.out.println("|------------------------------------------------------|");
        System.out.println("|Employee Id                      :" + Empid + "                 |");
        System.out.println("|Employee Name                    :" + Empname + "               |");
        System.out.println("|------------------------------------------------------|");
        System.out.println("|Basic Salary                     :" + Bsalary + "               |");
        System.out.println("|HRA 10%                          :" + hra + "                |");
        System.out.println("|TA  8%                           :" + ta + "                |");
        System.out.println("|DA  9%                           :" + da + "                |");
        System.out.println("|PF  8%                           :" + pf + "                |");
        System.out.println("|                                                      |");
        System.out.println("|------------------------------------------------------|");
        System.out.println("|Gross Salary                     :" + Gsalary + "               |");
        System.out.println("|======================================================|");

        scan.close();
    }
}
