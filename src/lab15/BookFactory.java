package lab15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookFactory {
    public static final String SEPARATOR = ";";

    public static void saveBookList(List<Book> bookList, String filePath) {
        if (bookList == null | filePath == null) {
            throw new IllegalArgumentException("[ERR] Book list or FilePath can't be null");
        }

        if (bookList.isEmpty()) {
            System.out.println("The book list is empty, nothing to write!");
            return;
        }

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            for (Book book : bookList) {
                String bookISBN = book.getISBN();
                String bookTitle = book.getTitle();
                String bookAuthor = book.getAuthor();
                int bookYear = book.getYear();
                String dataLine = bookISBN.concat(SEPARATOR).concat(bookTitle).
                        concat(SEPARATOR).concat(bookAuthor).concat(SEPARATOR).concat(String.valueOf(bookYear));
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Book> convertDataIntoList(String filePath) {
        List<Book> bookList = new ArrayList<>();

        if (filePath == null) {
            throw new IllegalArgumentException("[ERR] FilePath can't be null");
        }

        //System.out.println("Reading file from: " + filePath);

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(SEPARATOR);
                String bookISBN = bookData[0];
                String bookTitle = bookData[1];
                String bookAuthor = bookData[2];
                int bookYear = Integer.parseInt(bookData[3]);
                Book book = new Book(bookISBN, bookTitle, bookAuthor, bookYear);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bookList;
    }
}
