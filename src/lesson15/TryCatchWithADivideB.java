package lesson15;

import java.math.BigDecimal;
import java.util.Scanner;

/*
Cho user nhập 2 số a, b. In ra a/b.
Nếu user nhập b là số 0 thì yêu cầu nhập lại 1 lần
Nếu user tiếp tục nhập b = 0 lần 2 thì thoát chương trình
*/
public class TryCatchWithADivideB {
    public static void main(String[] args) {
        int a, b;
        int numberOfTry = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input dividend a: ");
        a = scanner.nextInt();
        System.out.print("Input divisor b: ");
        b = scanner.nextInt();

        while (numberOfTry < 1) {
            try {
                int quotient = a/b;
                System.out.println("Your result a/b is: " + quotient);
                break;
            } catch (Exception e) {
                numberOfTry++;
                System.out.print("Please input an other non-zero integer: ");
                b = scanner.nextInt();
                try {
                    System.out.println("Your result a/b is: " + divide(a, b));
                    break;
                } catch (Exception ex) {
//                    System.out.println("You input b = 0");
                }
            }
        }
    }

    public static int divide(int a, int b){
        return a/b;
    }
}
