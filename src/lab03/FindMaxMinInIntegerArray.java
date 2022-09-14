package lab03;

import java.util.Arrays;

public class FindMaxMinInIntegerArray {
    public static void main(String[] args) {
        int[] intArr = {0, 1, 2, 1115, 3, -2, 4, 0, 5, -2, 10, 25, 66, 1105, 101, 1001};
        int maxNumber = intArr[0];
        int minNumber = intArr[0];

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] >= maxNumber) maxNumber = intArr[i];
        }

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] <= minNumber) minNumber = intArr[i];
        }

        System.out.println("The array: " + Arrays.toString(intArr));
        System.out.println("Maximum = " + maxNumber);
        System.out.println("Minimum = " + minNumber);
    }
}
