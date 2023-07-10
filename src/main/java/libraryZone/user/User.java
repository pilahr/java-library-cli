package libraryZone.user;

import static libraryZone.user.UserUtils.generateUniqueId;

public class User {
    private long id;
    private String userName;
    private String password;
    private boolean hasLoanedBooks = false;

    public User(long id, String userName, String password) {
        this.id = generateUniqueId();
        this.userName = userName;
        this.password = password;
    }

    public User(){
    }


//    public ArrayList<Book> getLoanedBooks() {
//        return loanedBooks;
//    }

    public UserType getType() {
        return null;
    }

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
        this.userName = this.userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = this.password;
    }

    public boolean isHasLoanedBooks() {
        return hasLoanedBooks;
    }

    public void setHasLoanedBooks(boolean hasLoanedBooks) {
        this.hasLoanedBooks = hasLoanedBooks;
    }



//    public void loanBook(int id) {
//        for (Book book : Library.booksList) {
//            if (book.getId() == id) {
//                this.loanedBooks.add(book);
//                book.setCounter(book.getCounter()+1);
//                Library.booksList.remove(book);
//                Library.libraryLoanedBooks.put(book.getId(), this.id);
//                System.out.println("Book is now yours");
//                setHasLoanedBooks(true);
//                return;
//            }
//        }
//        System.out.println("Book out of stock.");
//    }
//
//    public void returnBook(int id) {
//        if(this.loanedBooks.size() == 0 ){
//            System.out.println("You have no loaned books.");
//            setHasLoanedBooks(false);
//            return;
//        }
//        displayLoanedBooks();
//        for (Book book : loanedBooks) {
//            if (book.getId() == id) {
//                this.loanedBooks.remove(book);
//                Library.booksList.add(book);
//                Library.libraryLoanedBooks.remove(book.getId());
//                System.out.println("Returned the Book");
//                return;
//            }
//        }
//        System.out.println("Wrong Book Id");
//    }
//
//    public void displayLoanedBooks() {
//        System.out.println("\n\t\t\t\t 🌟"+this.name + " Personal Loaned Books: ");
//        System.out.println("Books loaned: "+this.loanedBooks.size());
//        System.out.println("==========================================================");
//        for (Book book : this.loanedBooks) {
//            book.getBookExtendedDetails();
//        }
//        System.out.println("==========================================================");
//    }
}
