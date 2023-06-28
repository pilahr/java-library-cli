package libraryZone.book;

public class BookUtils {

    private static int nextBookId = 0;
    public static int generateUniqueBookId() {
        return ++nextBookId;
    }

    public static int getNextBookId() {
        return nextBookId;
    }

    public static void setNextBookId(int nextBookId) {
        BookUtils.nextBookId = nextBookId;
    }
}
