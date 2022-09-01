public class Main {
    public static void main(String[] args) {

        Autor stivenKing = new Autor("Stiven ","King");
        Autor stivenK = new Autor("Stiven", "King");
        System.out.println("Имя Автора - " + stivenKing.getName() + stivenKing.getSurname());
        System.out.println("stivenKing.equals() = " + stivenKing.equals(stivenK));
        Book later = new Book("Later", 2021,stivenKing);
        Book l = new Book("Later",2021,stivenKing);
        System.out.println("l.equals(later) = " + l.equals(later));
        System.out.println("Название книги -  " + later.getTitle());
        System.out.println("Издана в - " + later.getYear()+ " году");
        later.setYear(2022);
        System.out.println("Издана в - " + later.getYear() + " году");
        Autor jackLondon = new Autor("Jack ", "London");
        System.out.println("Имя автора - " + jackLondon.getName() + jackLondon.getSurname());
        Book loveOfLife = new Book("Live of love", 1907,jackLondon);
        System.out.println("Название книги - " + loveOfLife.getTitle());
        System.out.println("Издана в - " + loveOfLife.getYear() + " году");
        loveOfLife.setYear(1908);
        System.out.println(stivenK);
}
}

