package lab15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookListHandling {
    public static List<String> getISBNList(List<Book> bookList){
        List<String> ISBNList = new ArrayList<>();
        for (Book book : bookList) {
            ISBNList.add(book.getISBN());
        }
        return ISBNList;
    }

    public static void addNewBook(List<Book> bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input ISBN: ");
        String ISBN = scanner.nextLine();

        List<String> ISBNList = getISBNList(bookList);
        if (ISBNList.contains(ISBN)){
            System.out.println("This ISBN already exists in the book list. Please choose menu!");
        } else {
            System.out.print("Please input title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Please input author: ");
            String bookAuthor = scanner.nextLine();
            System.out.print("Please input year: ");
            int bookYear = scanner.nextInt();
            Book book = new Book(ISBN, bookTitle, bookAuthor, bookYear);
            bookList.add(book);
            System.out.println("The book is saved into DB with info: " + book);
        }
    }

    public static String inputTheISBNToSearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input ISBN: ");
        return scanner.nextLine();
    }

    public static void findABookByISBN(String ISBN, List<Book> bookList){
        List<String> ISBNList = getISBNList(bookList);
        if (ISBNList.indexOf(ISBN) == -1){
            System.out.println("Book with ISBN "+ ISBN + " is not found!");
        } else {
            System.out.println("Book information: " + bookList.get(ISBNList.indexOf(ISBN)));
        }
    }

    public static void updateABookViaISBN(String ISBN, List<Book> bookList){
        List<String> ISBNList = getISBNList(bookList);
        if (ISBNList.indexOf(ISBN) == -1){
            System.out.println("Book with ISBN "+ ISBN + " is not found!");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input new title: ");
            String newBookTitle = scanner.nextLine();
            System.out.print("Please input new author: ");
            String newBookAuthor = scanner.nextLine();
            System.out.print("Please input new year: ");
            int newBookYear = scanner.nextInt();
            bookList.get(ISBNList.indexOf(ISBN)).setTitle(newBookTitle);
            bookList.get(ISBNList.indexOf(ISBN)).setAuthor(newBookAuthor);
            bookList.get(ISBNList.indexOf(ISBN)).setYear(newBookYear);
            System.out.println("The book is now updated with new content: " + bookList.get(ISBNList.indexOf(ISBN)));
        }
    }

    public static void deleteABookViaISBN(String ISBN, List<Book> bookList){
        List<String> ISBNList = getISBNList(bookList);
        if (ISBNList.indexOf(ISBN) == -1){
            System.out.println("Book with ISBN "+ ISBN + " is not found!");
        } else {
            bookList.remove(ISBNList.indexOf(ISBN));
            System.out.println("The book with ISBN " + ISBN + " is now deleted from the book list");
        }
    }

    public static void printBookList(List<Book> bookList){
        if (bookList.isEmpty()){
            System.out.println("The book list is empty!");
        } else {
            for (Book book : bookList) {
                System.out.println("Book " + (bookList.indexOf(book) + 1) + ": " + book.getTitle());
                System.out.println("    ISBN: " + book.getISBN());
                System.out.println("    Author: " + book.getAuthor());
                System.out.println("    Year: " + book.getYear() + "\n");
            }
        }
    }
}
