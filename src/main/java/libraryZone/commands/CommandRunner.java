package libraryZone.commands;

import libraryZone.library.CSVConverter;

import java.io.File;
import java.util.Scanner;

public class CommandRunner {
    private Scanner scanner = new Scanner(System.in);

    public void buildLibrary() throws Exception {

        CSVConverter csvConverter = new CSVConverter();
        csvConverter.read(new File("src/main/java/libraryZone/library/books_data.csv"));

        start();
    }

    public void start() {
        System.out.println("Please choose a valid option: ");
        System.out.println("1: Log In \t2: Sign up \t3: See all the books \t4: Exit");

        String option = scanner.nextLine();
        switch (option) {
            case "1":
                logIn();
                break;
            case "2":
                signUp();
                break;
            case "3":
                seeAll();
                break;
            case "4":
                exit();
                break;
            default:
                wrongInput("start");
                break;
        }
    }

    private void wrongInput(String option) {
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
            case "sighUp":
                sighUp();
                break;
        }
    }

    private void logIn() {
        System.out.println("\t\t *** LogIn Menu ***");
        System.out.println("Please Enter Your Username");
        String userName = scanner.nextLine();

        System.out.println("\t\t *** LogIn Menu *** \n" + "\t UserName: " + userName);
        System.out.println("Please Enter Your Password");
        String password = scanner.nextLine();

        System.out.println("\t\t *** LogIn Menu *** \n" + "\t UserName: " + userName + "\n" + "\t Password: ********");




    }

    private void exit() {
        System.out.println("Exiting the library..");
    }


}
