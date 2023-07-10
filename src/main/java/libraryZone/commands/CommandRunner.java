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

        Library library = new Library();
        library.generateBooks();

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
            default:
                wrongInput("start");
                break;
        }
    }

    List<User> users = new ArrayList<>();
    private void signUp() throws IOException {
        System.out.println("\t\t *** Sign Up ***");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter Your Username");
//        String userName = scanner.nextLine();
//
//        System.out.println("Please Enter Your Password");
//        String password = scanner.nextLine();

        User user = createUserObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("src/main/java/libraryZone/library/users_data.json")) {
            gson.toJson(user, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public User createUserObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Username");
        String userName = scanner.nextLine();

        System.out.println("Please Enter Your Password");
        String password = scanner.nextLine();

        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);

        List<User> userList = new ArrayList<>();
        userList.add(user);

        return user;
    }


    private void wrongInput(String option) throws Exception {
        switch (option) {
            case "login":
                System.out.println("User Not Found");
                System.out.println("1: Retry \t2: Back to the main menu");
                String select = scanner.nextLine();
                if (select.equals("1")) {
                    logIn();
                } else if (select.equals("2")) {
                    start();
                } else {
                    wrongInput("login");
                }
                break;
            case "start":
                start();
                break;
        }
    }

    private void logIn() {
        System.out.println("\t\t *** LogIn Menu ***");
        System.out.println("Please Enter Your Username");
        String userName = scanner.nextLine();

        System.out.println("\t\t *** LogIn Menu *** \n" + "UserName: " + userName);
        System.out.println("Please Enter Your Password");
        String password = scanner.nextLine();

        System.out.println("\t\t *** LogIn Menu *** \n" + "UserName: " + userName + "\n" + "Password: ********");

//        JsonParser parser = new JsonParser();
//        try {
//            Object obj = parser.parse(new FileReader("src/main/java/libraryZone/library/mockUser.json"));
//            JsonObject jsonObject = (JsonObject) obj;
//            JsonArray userNameData = (JsonArray) jsonObject.get("username");
//            JsonArray passwordData = (JsonArray) jsonObject.get("password");
//
//            if (userName.equalsIgnoreCase(String.valueOf(userNameData)) && password.equalsIgnoreCase(String.valueOf(passwordData))) {
//                System.out.println("Log in success!");
//            } else {
//                System.out.println("Please enter a valid username and password");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }




    }

    private void exit() {
        System.out.println("Exiting the library..");
    }


}
