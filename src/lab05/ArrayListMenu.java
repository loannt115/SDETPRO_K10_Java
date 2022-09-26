package lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMenu {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int selectedNumber;
        System.out.println("=====MENU======\n" +
                "1. Add number into ArrayList: \n" +
                "2. Print numbers\n" +
                "3. Get maximum number\n" +
                "4. Get minimum number\n" +
                "5. Search number: \n" +
                "0. Exit");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose menu: ");
            selectedNumber = scanner.nextInt();
            if (selectedNumber == 1) {
                Scanner scannerNumber = new Scanner(System.in);
                System.out.print("What number you want to add? ");
                int insertedNumber = scanner.nextInt();
                arrayList.add(insertedNumber);
                System.out.println("==> " + insertedNumber + " is added to the array!");
            } else if (selectedNumber == 2) {
                System.out.println("==> Current array: " + arrayList);
            } else if (selectedNumber == 3) {
                System.out.println("==> Maximum number: " + maximumOfArrayList(arrayList));
            } else if (selectedNumber == 4) {
                System.out.println("==> Minimum number: " + minimumOfArrayList(arrayList));
            } else if (selectedNumber == 5) {
                Scanner scannerSearchNumber = new Scanner(System.in);
                System.out.print("Input the number you want to search: ");
                int searchNumber = scannerSearchNumber.nextInt();
                System.out.println(indexOfNumber(searchNumber, arrayList));
            } else if (selectedNumber != 0) System.out.println("Please choose correct menu!");
        } while (selectedNumber != 0);
    }

    private static Integer maximumOfArrayList(ArrayList<Integer> arrayList) {
        int maxNumber = arrayList.get(0);
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) > maxNumber) maxNumber = arrayList.get(index);
        }
        return maxNumber;
    }

    private static Integer minimumOfArrayList(ArrayList<Integer> arrayList) {
//        Collections.sort(arrayList);
//        return arrayList.get(0);
        int minNumber = arrayList.get(0);
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) < minNumber) minNumber = arrayList.get(index);
        }
        return minNumber;
    }

    private static String indexOfNumber(int searchNumber, ArrayList<Integer> arrayList) {
        int indexOfSearchNumber = arrayList.indexOf(searchNumber) + 1;
        if (arrayList.indexOf(searchNumber) == -1) {
            return ("==> " + searchNumber + " is not in the array.");
        } else
            return ("==> " + searchNumber + " ở vị trí thứ " + indexOfSearchNumber + " trong mảng.");
    }
}
