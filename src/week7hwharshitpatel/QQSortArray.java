package week7hwharshitpatel;

/*Write a Java program to sort a numeric array and a string array*/

import java.util.Arrays;

public class QQSortArray {

    public static void sortarray(){
int[] iarray = {1, 920, 265, 80, 26, 164, 128, 200, 350, 40,};
String [] sarray = {"Java", "Python", "Integer", "System", "Regression", "Smoke", "Retesting", "Build"};

        System.out.println("Current Numeric Arrays order ");
        System.out.println( Arrays.toString(iarray));
        System.out.println("------------------------------------------------------------------------------------------");
        Arrays.sort(iarray);
        System.out.println("Numeric Arrays Sorted by Ascending order");
        System.out.println(Arrays.toString(iarray));
        System.out.println("******************************************************************************************");
        System.out.println("Current String Arrays order ");
        System.out.println( Arrays.toString(sarray));
        System.out.println("------------------------------------------------------------------------------------------");
        Arrays.sort(sarray);
        System.out.println("String Arrays Sorted by Ascending order");
        System.out.println(Arrays.toString(sarray));
    }

    public static void main(String[] args) {
        sortarray();
    }

}
