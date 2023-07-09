package libraryZone.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import libraryZone.book.Book;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class CSVConverter {

    public void read(File file) throws Exception {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            List<String[]> data = csvReader.readAll();

            HashSet<Book> hsBooks = new HashSet<>();
            String[] header = data.get(0);
            System.out.println("header: " + Arrays.toString(header));

            String[] dataRow = {};
            for (int i = 1; i < data.size(); i++) {
                dataRow = data.get(i);
                System.out.println("dataRow: " + Arrays.toString(dataRow));
            }

            Book newBook = new Book();
            for (int j = 0; j < dataRow.length; j++) {

                String col = header[j].trim();
                System.out.println("col: " + col);

                String row = dataRow[j].trim();
                System.out.println("row: " + row);


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
            newBook.setCounter(0);
            hsBooks.add(newBook);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonBook = gson.toJson(hsBooks);

            FileWriter fileWriter = new FileWriter("hsBooks.json");
            fileWriter.write(jsonBook);
            fileWriter.close();


        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }


}


