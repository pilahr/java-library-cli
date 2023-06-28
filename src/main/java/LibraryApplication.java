import libraryZone.book.Book;

import java.io.*;
import java.util.Scanner;

public class LibraryApplication {

    public static void readCsvUsingScanner(String filePath) throws FileNotFoundException {

        try {
            Scanner scanner = new Scanner(new File(filePath));
            while ( (scanner.hasNext())) {
                System.out.println("Library data: " + scanner.nextLine().toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        String line = "";
//
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(filePath));
//
//            while (line = reader.readLine() != null) {
//                String[] data = line.split(",");
//                Book book = new Book(data[0], data[1], Integer.getInteger(data[2]), null);
//                System.out.println("data: " + new Book().toJson(data));
//
//
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }


    public static void main(String[] args) throws FileNotFoundException {
        readCsvUsingScanner("/Users/piyapornlahr/nology/java-library-cli/src/main/java/libraryZone/library/books_data.csv");

    }
}
