import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Firat Suyu Kan Akiyor Baksana", 355, "Yasar Kemal", "1948"));
        books.add(new Book("Karincanin Su Ictigi", 452, "Yasar Kemal", "1955"));
        books.add(new Book("Tan Yeri Horozlari", 262, "Yasar Kemal", "1965"));
        books.add(new Book("Ciplak Deniz Ciplak Ada", 505, "Yasar Kemal", "1970"));
        books.add(new Book("Ince Memed", 478, "Yasar Kemal", "1975"));

        System.out.println("Kitap Adlarina Gore Siralama\n");
        for (Book book : books) {
            System.out.println(book.getBookName());
        }

        System.out.println("============================");

        TreeSet<Book> books2 = new TreeSet<>(Comparator.comparingInt(Book::getPageNumber));
        books2.add(new Book("Kurk Mantolu Madonna", 355, "Sabahattin Ali", "1948"));
        books2.add(new Book("Icimizdeki Seytan", 458, "Sabahattin Ali", "1958"));
        books2.add(new Book("Kuyucakli Yusuf", 287, "Sabahattin Ali", "1978"));
        books2.add(new Book("Sirca Kosk", 525, "Sabahattin Ali", "1928"));
        books2.add(new Book("Yeni Dunya", 488, "Sabahattin Ali", "1968"));

        System.out.println("Kitap Sayfa Sayilarina Gore Siralama\n");
        for (Book book : books2) {
            System.out.println(book.getBookName() + ", " + book.getPageNumber());
        }
    }
}
