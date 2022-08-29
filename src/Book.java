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
}
