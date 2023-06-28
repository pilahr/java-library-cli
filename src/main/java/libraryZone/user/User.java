package libraryZone.user;

import java.util.ArrayList;



public abstract class User {

    private long id;
    private String name;
    private int age;
    private String email;

    private boolean hasLoanedBooks = false;

    public boolean isHasLoanedBooks() {
        return hasLoanedBooks;
    }

    public void setHasLoanedBooks(boolean hasLoanedBooks) {
        this.hasLoanedBooks = hasLoanedBooks;
    }
}
