package lab03;

import java.util.Arrays;

public class SortAnIntegerArray {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 1, 28, 16};
        System.out.println("The origin array: " + Arrays.toString(intArr));

        for (int i = 0; i < intArr.length; i++) {
            int minValue = intArr[i];
            int minIndex = i;
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < minValue) {
                    minValue = intArr[j];
                    minIndex = j;
                }
            }
            int temp = intArr[i];
            intArr[i] = minValue;
            intArr[minIndex] = temp;
        }

        System.out.println("The array after sorting: " + Arrays.toString(intArr));
    }
}
