package libraryZone.book;

import java.util.Comparator;

public class SortBooksByGenre implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if( o1.getGenre().equalsIgnoreCase(o2.getGenre()) || o1.getSubgenre().equalsIgnoreCase(o2.getSubgenre()) ) {
            return (o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase()));
        }
        return o1.getGenre().toLowerCase().compareTo( o2.getGenre().toLowerCase());
    }
}
