package task_14;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", edition=" + edition +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (price != book.price) return false;
        if (!Objects.equals(title, book.title)) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int num = 42;
        int result = title != null ? title.hashCode() : 0;
        result = num * result + (author != null ? author.hashCode() : 0);
        result *= result + price;
        return result;
    }

    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.price, this.isbn);
    }
    @Override
    public int compareTo(Book o) {
        return isbn - o.getIsbn();
    }
}

