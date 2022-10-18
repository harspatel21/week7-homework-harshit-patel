package week7hwharshitpatel;
/*11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
*/

public class KKDivide {

    public static void divide() {
        System.out.println("** Numbers between 1 to 100 which can be divided by 3 **");

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("");
        System.out.println("** Numbers between 1 to 100 which can be divided by 5 **");
        for (int x = 1; x < 100; x++) {
            if (x % 5 == 0)
                System.out.print(x + ", ");
        }
    }

    public static void main(String[] args) {

        divide();
    }
}
