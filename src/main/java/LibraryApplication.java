import libraryZone.library.CSVConverter;

import java.io.File;


public class LibraryApplication {

//    public static void readCsvUsingScanner(String filePath) throws FileNotFoundException {
//
//        try {
//            Scanner scanner = new Scanner(new File(filePath));
//            while ( (scanner.hasNext())) {
//                System.out.println("Library data: " + scanner.nextLine().toString());
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }


    public static void main(String[] args) throws Exception {
        CSVConverter csvConverter = new CSVConverter();
        csvConverter.read(new File("src/main/java/libraryZone/library/books_data.csv"));



//        readCsvUsingScanner("/Users/piyapornlahr/nology/java-library-cli/src/main/java/libraryZone/library/books_data.csv");

    }
}
