package libraryZone.library;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CSVConverter {

    public void read(File file) throws Exception {
        try (CSVReader csvReader = new CSVReader(new FileReader(file))) {
            String[] nextline;
            while ((nextline = csvReader.readNext()) != null) {
                if (nextline != null) {
                    System.out.println(Arrays.toString(nextline));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


