package week7hwharshitpatel;

//19. Write a Java program to calculate the average value of array elements.

import java.util.Arrays;

public class SSAverageArray {

    public static void average() {

        int[] numarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Arrays = " + Arrays.toString(numarray));
        double sum = 0;
        int i = 0;
        int length = numarray.length;


        for (i = 0; i < numarray.length; i++)
            sum += numarray[i];
        double average = sum / length;

        System.out.println("Average of Arrays = " + average);

    }

    public static void main(String[] args) {
        average();
    }
}

