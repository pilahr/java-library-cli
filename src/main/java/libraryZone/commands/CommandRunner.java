package libraryZone.commands;

import com.google.gson.*;
import libraryZone.library.Library;
import libraryZone.user.User;

import java.io.*;
import java.util.*;

public class CommandRunner {
    private Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    public void buildLibrary() throws Exception {
        start();
    }

    public void start() throws Exception {
        System.out.println("\nPlease choose a valid option: ");
        System.out.println("1: Log In \t2: Sign Up \t3: See all the books \t4: Exit");

        String option = scanner.nextLine();
        switch (option) {
            case "1":
                logIn();
                break;
            case "2":
                signUp();
                break;
            case "3":
                library.displayAllBooks();
                start();
                break;
            case "4":
                exit();
                break;
        }
    }

    public final String USERS = "src/main/java/libraryZone/library/users_data.json";
    public Gson gson = new GsonBuilder().setPrettyPrinting().create();
    HashMap<String, String> usersMap = new HashMap<>();

    private void signUp() throws IOException {
        System.out.println("\t\t *** Sign Up ***");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Username");
        String userName = scanner.nextLine();

        System.out.println("Please Enter Your Password");
        String password = scanner.nextLine();

        List<User> users = new ArrayList<>();
        User newUser = new User();

        newUser.setUserName(userName);
        newUser.setPassword(password);
        newUser.setHasLoanedBooks(false);

        users.add(newUser);

        String jsonUser = gson.toJson(users);
        FileWriter fileWriter = new FileWriter("src/main/java/libraryZone/library/users_data.json");
        fileWriter.write(jsonUser);
        fileWriter.close();



//        usersMap.put(userName,password);
//
//        String jsonUser = gson.toJson(usersMap);
//        FileWriter fileWriter = new FileWriter("src/main/java/libraryZone/library/users_data.json");
//        fileWriter.write(jsonUser);
//        fileWriter.close();
//
//        User newUser = new User();
//        newUser.setUserName(usersMap.get(password));
//        newUser.setPassword(usersMap.get(userName));
//        {
//            "admin": "1111"
//        }
}


    private void logIn() throws FileNotFoundException {
        System.out.println("\t\t *** LogIn Menu ***");
        System.out.println("Please Enter Your Username");
        String userName = scanner.nextLine();

        System.out.println("\t\t *** LogIn Menu *** \n" + "UserName: " + userName);
        System.out.println("Please Enter Your Password");
        String password = scanner.nextLine();

        System.out.println("\t\t *** LogIn Menu *** \n" + "UserName: " + userName + "\n" + "Password: ********");

//        FileReader fileReader = new FileReader(USERS);
//
//        User[] usersArr = gson.fromJson(fileReader, User[].class);
//        List<User> users = Arrays.asList(usersArr);
//
//        for (User user : users) {

//        }

    }

    private void exit() {
        System.out.println("Exiting the library..");
    }


}
