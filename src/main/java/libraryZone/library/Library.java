package libraryZone.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import libraryZone.book.*;
import libraryZone.user.User;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class Library {

    public ArrayList<Book> booksList = new ArrayList<>();
    public HashMap<Long, Long> loanedBook = new HashMap<>();

    public Library() {
        System.out.println("Welcome To The Library..");
    }

    // USERS
//    public ArrayList<User> usersList = new ArrayList<>();
//    public void addUser(User user) {
//        usersList.add(user);
//    }
//
//    public void deleteUser(long id) {
//        for (User user : usersList) {
//            if (user.getId() == id) {
//                usersList.remove(user);
//                return;
//            }
//        }
//        System.out.println("Wrong Id");
//    }
//
//    public int getUserCount() {
//        return usersList.size();
//    }

    // BOOKS
    public void addBook(Book book) {
        booksList.add(book);
    }

    public void deleteBook(int id) {
        for (Book book : booksList) {
            if (book.getId() == id) {
                booksList.remove(book);
                return;
            }
        }
        System.out.println("Wrong Id");
    }

    public final String BOOKS = "src/main/java/libraryZone/library/books_data.json";
    public Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void displayAllBooks() throws FileNotFoundException {
        FileReader fileReader = new FileReader(BOOKS);
        Book[] booksArr = gson.fromJson(fileReader, Book[].class);
        List<Book> books = Arrays.asList(booksArr);
        System.out.println("** The Library has totally: " + books.size() + " books. **\n");

        for (Book book : books) {
            System.out.println(book.getBookInformation());
        }
    }
}
