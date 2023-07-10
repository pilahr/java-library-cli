package libraryZone.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import libraryZone.book.*;

import java.io.*;
import java.util.*;

public class CSVConverter {

    List<Book> books = new ArrayList<>();

    public void read(File file) throws Exception {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            List<String[]> data = csvReader.readAll();


            String[] header = data.get(0); //[Number, Title, Author, Genre, SubGenre, Publisher]

            String[] dataRow = {};
            for (int i = 1; i < data.size(); i++) {
                dataRow = data.get(i); // each book data

                Book newBook = new Book();
                String col = null;
                String row = null;
                for (int j = 0; j < dataRow.length; j++) {

                    col = header[j].trim();
                    row = dataRow[j].trim();

                    switch (col) {
                        case "Number":
                            newBook.setId(Long.parseLong(row));
                            break;
                        case "Title":
                            newBook.setTitle(row);
                            break;
                        case "Author":
                            newBook.setAuthor(row);
                            break;
                        case "Genre":
                            newBook.setGenre(row);
                            break;
                        case "SubGenre":
                            newBook.setSubgenre(row);
                            break;
                        case "Publisher":
                            newBook.setPublisher(row);
                            break;
                    }
                }
                books.add(newBook);
                //newBook.setCounter(0);
            }

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonBook = gson.toJson(books);

            FileWriter fileWriter = new FileWriter("src/main/java/libraryZone/library/books_data.json");
            fileWriter.write(jsonBook);
            fileWriter.close();

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }

//    public ArrayList<Book> fullBookLibraryArr = new ArrayList<>();
//    public void copyLibraryArr() {
//        fullBookLibraryArr.addAll(books);
//    }
//
//    public int getBooksCount() {
//        return books.size();
//    }
//
//    public void displayAllBooks() {
//        for (Book book : books) {
//            System.out.println(book.getBookInformation("return"));
//        }
//    }
//
//    public void displayLimitedBooks (int limit) {
//        System.out.println("\t\t *** Books in the Library ***");
//        System.out.println("Amount of books in the Library: " + this.getBooksCount());
//
//        for (int i = 0; i < limit; i++) {
//            System.out.println(books.get(i).getBookInformation("return"));
//        }
//    }
//
//    public void sortBookBy(BookType sortFilter, int limit) {
//        switch (sortFilter) {
//            case title:
//                books.sort(new SortBooksByTitle());
//                break;
//            case author:
//                books.sort(new SortBooksByAuthor());
//                break;
//            case genre:
//                books.sort(new SortBooksByGenre());
//                break;
//            case publisher:
//                books.sort(new SortBooksByPublisher());
//                break;
//            case counter:
//                books.sort(new SortBooksByCounter());
//                break;
//            default:
//                Collections.sort(books);
//        }
//        displayLimitedBooks(limit);
//    }




}


