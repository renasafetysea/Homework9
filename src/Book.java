import java.util.Objects;

public class Book {
    private String title;
    private Autor autor;
    private int year;

    public Book(String title, int year, Autor autor) {
        this.title = title;
        this.autor = autor;
        this.year = year;

    }

    public String getTitle() {
        return this.title;
    }
    public Autor getAutor(){
        return autor;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title) && autor.equals(book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, year);
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor=" + autor +
                ", year=" + year +
                '}';
    }
}