package libraryZone.user;

import java.util.ArrayList;



public abstract class User {

    private long id;
    private String userName;
    private String password;

    private boolean hasLoanedBooks = false;

    public User(long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public abstract UserType getType();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isHasLoanedBooks() {
        return hasLoanedBooks;
    }

    public void setHasLoanedBooks(boolean hasLoanedBooks) {
        this.hasLoanedBooks = hasLoanedBooks;
    }
}
