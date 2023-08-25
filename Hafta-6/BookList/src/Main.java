import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Ince Memed I",350,"Yasar Kemal", 1955 ));
        bookList.add(new Book("Firat Suyu Kan Akiyor Baksana", 367, "Yasar Kemal", 1997));
        bookList.add(new Book("Kurk Mantolu Madonna", 268, "Sabahattin Ali",1943));
        bookList.add(new Book("Icimizdeki Seytan", 54, "Sabahattin Ali", 1940));
        bookList.add(new Book("Da Vinci Sifresi", 522, "Dan Brown", 2003));
        bookList.add(new Book("Dijital Kale", 563,"Dan Brown", 1998));
        bookList.add(new Book("The Secret Adversary",86, "Agatha Christie",1922));
        bookList.add(new Book("Cards on the Table", 574,"Agatha Christie", 1936));
        bookList.add(new Book("Kadin Yok Savasin Yuzunde", 446, "Svetlana Aleksiyevic",1985));
        bookList.add(new Book("Olasiliksiz",655,"Adam Fawer",2005));

        Map<String, String > bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(), book.getAuthor()));

        System.out.println("----- Yazarlar ve Kitaplar -----");

        for(String name: bookMap.keySet()){
            System.out.println(name + " - " + bookMap.get(name));
        }

        System.out.println();

        System.out.println("----- 100 Sayfadan fazla olan kitaplar -----");

        List<Book> filteredBooks = bookList.stream().filter(book -> book.getPage() >100).collect(Collectors.toList());

        filteredBooks.stream().forEach(book -> System.out.println(
                "Author: " + book.getAuthor() + "\nBook: " + book.getName()+
                        "\nPage: " + book.getPage() + "\nPublished: " + book.getPublish() +
                        "\n---------------------"));
    }
}
