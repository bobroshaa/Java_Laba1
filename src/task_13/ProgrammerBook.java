package task_13;

import task_12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", language='" + language + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProgrammerBook that = (ProgrammerBook) o;

        if (level != that.level) return false;
        return Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        int num = 42;
        int result = super.hashCode();
        result = result + num + (language != null ? language.hashCode() : 0);
        result *= (result + level);
        return result;
    }
}
