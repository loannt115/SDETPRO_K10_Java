package lab_common;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHandling {
    public static void addNumberIntoArrayList(ArrayList<Integer> arrayList){
        Scanner scannerNumber = new Scanner(System.in);
        System.out.print("What number you want to add? ");
        int insertedNumber = scannerNumber.nextInt();
        arrayList.add(insertedNumber);
        System.out.println("==> " + insertedNumber + " is added to the array!");
    }

    public static void printArrayList(ArrayList<Integer> arrayList){
        if (arrayList.isEmpty()) {
            System.out.println("==> The array is empty!");
        } else
            System.out.println("==> Current array: " + arrayList);
    }

    public static void printMaximumOfArrayList(ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("==> The array is empty!");
        } else {
            int maxNumber = arrayList.get(0);
            for (int index = 0; index < arrayList.size(); index++) {
                if (arrayList.get(index) > maxNumber) maxNumber = arrayList.get(index);
            }
            System.out.println("==> Maximum number: " + maxNumber);
        }
    }

    public static void printMinimumOfArrayList(ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("==> The array is empty!");
        } else {
            int minNumber = arrayList.get(0);
            for (int index = 0; index < arrayList.size(); index++) {
                if (arrayList.get(index) < minNumber) minNumber = arrayList.get(index);
            }
            System.out.println("==> Maximum number: " + minNumber);
        }
    }

    public static int inputANumberToSearchInArrayList(){
        Scanner scannerSearchNumber = new Scanner(System.in);
        System.out.print("Input the number you want to search: ");
        return scannerSearchNumber.nextInt();
    }

    public static void indexOfNumberInArrayList(int searchNumber, ArrayList<Integer> arrayList) {
        if (arrayList.indexOf(searchNumber) == -1) {
            System.out.println("==> " + searchNumber + " is not in the array.");
        } else {
            int countSearchNumber = 0;
            ArrayList<Integer> positionOfNumber = new ArrayList<>();
            String positionOfNumberStr = "";
            for (int index = 0; index < arrayList.size(); index++) {
                if (arrayList.get(index) == searchNumber) {
                    countSearchNumber++;
                    positionOfNumber.add(index + 1);
                }
            }
            if (countSearchNumber == 1) {
                positionOfNumberStr = positionOfNumber.get(0).toString();
            } else if (countSearchNumber == 2) {
                positionOfNumberStr = positionOfNumber.get(0) + " và " + positionOfNumber.get(1);
            } else {
                for (int index = 0; index < (positionOfNumber.size() - 2); index++) {
                    positionOfNumberStr = positionOfNumberStr + positionOfNumber.get(index) + ", ";
                }
                positionOfNumberStr = positionOfNumberStr
                        + positionOfNumber.get(positionOfNumber.size() - 2)
                        + " và " + + positionOfNumber.get(positionOfNumber.size() - 1);
            }
            System.out.println("==> Có " + countSearchNumber + " số " + searchNumber + " trong mảng ở vị trí thứ " + positionOfNumberStr + ".");
        }
    }
}
