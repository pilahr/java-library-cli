package libraryZone.book;

import java.util.Comparator;

public class SortBooksByPublisher  implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if( o1.getPublisher().equalsIgnoreCase(o2.getPublisher()) ) {
            return (int) (o1.getId() - ( o2.getId()));
        }
        return o1.getPublisher().toLowerCase().compareTo( o2.getPublisher().toLowerCase() );
    }
}
