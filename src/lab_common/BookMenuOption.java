package lab_common;

import java.util.Scanner;

public class BookMenuOption {
    public static void printMenuOption() {
        System.out.println("======= Book Management Program (CRUD)============\n" +
                "1. New book\n" +
                "2. Find a book(ISBN)\n" +
                "3. Update a book\n" +
                "4. Delete a book\n" +
                "5. Print the book list\n" +
                "0. Exit");
    }

    public static int selectAMenuOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose menu: ");
        return scanner.nextInt();
    }
}
