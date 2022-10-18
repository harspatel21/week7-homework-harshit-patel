package week7hwharshitpatel;
//20. Write a Java program to test if an array contains a specific value.

public class TTSpecificArray {

    public static void specificarray() {
        int[] num = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int toFind = 14;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }

    public static void main(String[] args) {
        specificarray();
    }

}

