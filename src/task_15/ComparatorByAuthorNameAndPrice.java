package task_15;

import task_14.Book;

import java.util.Comparator;

public class ComparatorByAuthorNameAndPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        if (result != 0) return result;
        result = o1.getTitle().compareTo(o2.getTitle());
        if (result != 0) return result;
        return result = o1.getPrice() - o2.getPrice();
    }
}
