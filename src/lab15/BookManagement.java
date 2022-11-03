package lab15;

import lab_common.BookMenuOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookManagement {
    public static void main(String[] args) {
//        Book book1 = new Book("1", "Nhat ky trong tu", "HCM", 1921);
//        Book book2 = new Book("2", "Tu ay", "Tố Hữu", 1967);
//
//        List<Book> toWriteBookList = Arrays.asList(book1, book2);
        String projectLocation = System.getProperty("user.dir");
        String relativeFilePath = "\\src\\lab15\\book.txt";
        String absoluteFilePath = projectLocation.concat(relativeFilePath);
//
//        BookFactory.saveBookList(toWriteBookList, absoluteFilePath);
//
//        List<Book> convertedBookList = BookFactory.convertDataIntoList(absoluteFilePath);
//        System.out.println(convertedBookList);
        List<Book> currentBookList = BookFactory.convertDataIntoList(absoluteFilePath);

        boolean isContinuing = true;
        while (isContinuing) {
//            List<Book> currentBookList = BookFactory.convertDataIntoList(absoluteFilePath);
            BookMenuOption.printMenuOption();
            int selectedOption = BookMenuOption.selectAMenuOption();
            switch (selectedOption) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    BookListHandling.addNewBook(currentBookList);
                    BookFactory.saveBookList(currentBookList, absoluteFilePath);
                    break;
                case 2:
                    String ISBNToFindBook = BookListHandling.inputTheISBNToSearch();
                    BookListHandling.findABookByISBN(ISBNToFindBook, currentBookList);
                    break;
                case 3:
                    String ISBNToUpdate = BookListHandling.inputTheISBNToSearch();
                    BookListHandling.updateABookViaISBN(ISBNToUpdate, currentBookList);
                    BookFactory.saveBookList(currentBookList, absoluteFilePath);
                    break;
                case 4:
                    String ISBNToDelete = BookListHandling.inputTheISBNToSearch();
                    BookListHandling.deleteABookViaISBN(ISBNToDelete, currentBookList);
                    BookFactory.saveBookList(currentBookList, absoluteFilePath);
                    break;
                case 5:
                    BookListHandling.printBookList(currentBookList);
                    break;
                default:
                    System.out.println("Please choose correct menu option!");
            }
        }

    }
}
