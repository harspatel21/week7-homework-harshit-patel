package week7hwharshitpatel;
/*18. Write a Java program to sum values of an array.
 */

import java.util.Arrays;

public class RRSumOfArray {

    public static void sum() {
        int[] numarray = {5, 7, 8, 10};
        System.out.println("Arrays = " + Arrays.toString(numarray));
        int sum = 0;
        int i = 0;


        for (i = 0; i < numarray.length; i++)
            sum += numarray[i];
        System.out.println("Sum of Arrays = " + sum);

    }

    public static void main(String[] args) {
        sum();
    }
}
