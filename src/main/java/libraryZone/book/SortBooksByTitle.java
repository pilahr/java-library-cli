package libraryZone.book;

import java.util.Comparator;

public class SortBooksByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if( o1.getTitle().equalsIgnoreCase(o2.getTitle()) ) {
            return o1.getAuthor().toLowerCase().compareTo( o2.getAuthor().toLowerCase() );
        }
        return o1.getTitle().toLowerCase().compareTo( o2.getTitle().toLowerCase());
    }
}
