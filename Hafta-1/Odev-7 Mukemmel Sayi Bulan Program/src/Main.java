import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Değişkenlerimizi tanımlayalım.
        int number, total = 0;

        // Kullanıcıdan sayıyı girmesini isteyelim.
        System.out.print("Bir sayi giriniz: ");
        number = scan.nextInt();

        // Döngü ve koşullu ifadeler ile mükemmel sayi olup olmadığını kontrol ediyoruz.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " sayiyisi mukemmel sayidir.");
        } else {
            System.out.println(number + " sayiyisi mukemmel sayi degildir.");
        }
    }
}
