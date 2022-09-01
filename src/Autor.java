import java.util.Objects;

public class Autor {
    private String name;
    private String surname;
    public Autor(String name,String surname){
        this.name =name;
        this.surname = surname;

    }
    public String getName(){
        return name;

    }
    public String getSurname(){
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return name.equals(autor.name) && surname.equals(autor.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}