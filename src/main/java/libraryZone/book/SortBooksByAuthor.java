package libraryZone.book;

import java.util.Comparator;

public class SortBooksByAuthor implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        if( o1.getAuthor().equalsIgnoreCase(o2.getAuthor()) ) {
            return o1.getTitle().toLowerCase().compareTo( o2.getTitle().toLowerCase() );
        }
        return o1.getAuthor().toLowerCase().compareTo( o2.getAuthor().toLowerCase() );
    }
}
