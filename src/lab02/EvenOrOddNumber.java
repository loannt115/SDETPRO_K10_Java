package lab02;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        long my_Number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        if (scanner.hasNextLong()) {
            my_Number = scanner.nextLong();
            if (my_Number % 2 == 0) {
                System.out.println("Your number is even!");
            } else {
                System.out.println("Your number is odd!");
            }
        } else {
            System.out.println("Please input a valid integer in Java!");
        }
    }
}
