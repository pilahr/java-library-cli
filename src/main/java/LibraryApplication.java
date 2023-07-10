import libraryZone.commands.CommandRunner;
import libraryZone.library.CSVConverter;

import java.io.File;


public class LibraryApplication {



    public static void main(String[] args) throws Exception {

        CommandRunner command = new CommandRunner();
        command.buildLibrary();

//        CSVConverter csvConverter = new CSVConverter();
//        csvConverter.read(new File("src/main/java/libraryZone/library/books_data.csv"));

    }
}
