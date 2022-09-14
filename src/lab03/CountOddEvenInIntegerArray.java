package lab03;

import java.util.Arrays;

public class CountOddEvenInIntegerArray {
    public static void main(String[] args) {
        int[] intArr = {0, 1, 2, 3, 4, 5, 10, 25, 66, 101, 1001};
        int evenNumber = 0;
        int oddNumber = 0;

        for (int element : intArr) {
            if (element % 2 == 0) evenNumber++;
            else oddNumber++;
        }

        System.out.println("The array: " + Arrays.toString(intArr));
        System.out.println("Even Number = " + evenNumber);
        System.out.println("Odd Number = " + oddNumber);
    }
}
