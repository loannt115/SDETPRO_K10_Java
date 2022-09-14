package lab03;

import java.util.Arrays;

public class SortMerge2IntegerArrays {
    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 16, 28, 34};
        int[] intArr2 = {1, 13, 16, 27, 99, -1};
        int intArrLen = intArr1.length + intArr2.length;
        int[] intArr = new int[intArrLen];

        System.out.println("The origin array 1: " + Arrays.toString(intArr1));
        System.out.println("The origin array 2: " + Arrays.toString(intArr2));

        for (int i = 0; i < intArr1.length; i++) {
            intArr[i] = intArr1[i];
        }

        for (int i = 0; i < intArr2.length; i++) {
            intArr[intArr1.length + i] = intArr2[i];
        }

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
        System.out.println("The merged array after sorting " + Arrays.toString(intArr));
    }
}
