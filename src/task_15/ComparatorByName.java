package task_15;

import task_14.Book;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
