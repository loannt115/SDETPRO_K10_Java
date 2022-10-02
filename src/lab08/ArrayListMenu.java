package lab08;

import lab_common.ArrayListHandling;
import lab_common.MenuOption;

import java.util.ArrayList;

public class ArrayListMenu {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing) {
            MenuOption.printMenuOption();
            int selectedOption = MenuOption.selectAMenuOption();
            switch (selectedOption) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    ArrayListHandling.addNumberIntoArrayList(arrayList);
                    break;
                case 2:
                    ArrayListHandling.printArrayList(arrayList);
                    break;
                case 3:
                    ArrayListHandling.printMaximumOfArrayList(arrayList);
                    break;
                case 4:
                    ArrayListHandling.printMinimumOfArrayList(arrayList);
                    break;
                case 5:
                    int searchNumber = ArrayListHandling.inputANumberToSearchInArrayList();
                    ArrayListHandling.indexOfNumberInArrayList(searchNumber, arrayList);
                    break;
                default:
                    System.out.println("Please choose correct menu option!");
            }
        }
    }
}
