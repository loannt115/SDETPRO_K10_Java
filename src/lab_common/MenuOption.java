package lab_common;

import java.util.Scanner;

public class MenuOption {
    public static void printMenuOption(){
        System.out.println("=====MENU======\n" +
                "1. Add number into ArrayList: \n" +
                "2. Print numbers\n" +
                "3. Get maximum number\n" +
                "4. Get minimum number\n" +
                "5. Search number: \n" +
                "0. Exit");
    }

    public static int selectAMenuOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose menu: ");
        return scanner.nextInt();
    }


}
