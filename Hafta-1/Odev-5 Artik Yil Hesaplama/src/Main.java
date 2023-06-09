import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım.
        int year;

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıda değişkenleri isteyelim.
        System.out.print("Yil giriniz: ");
        year = scan.nextInt();

        // Koşullu ifadeler ile atık yıl kontrolünü sağlıyoruz.
        if (year >= 0) {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.print(year + " yili" + " bir artik yildir !");
                } else if (year % 100 == 0 && year % 400 == 0) {
                    System.out.print(year + " yili" + " bir artik yil !");
                } else {
                    System.out.print(year + " yili" + " bir artik yil degildir !");
                }
            } else {
                System.out.print(year + " yili" + " artik bir yil degildir !");
            }
        } else {
            System.out.print("Gecerli bir yil giriniz !");
        }
    }
}
