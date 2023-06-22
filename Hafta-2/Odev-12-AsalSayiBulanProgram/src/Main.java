import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number, int divisor) {
        // 2'den küçük sayılar asal değildir.
        if (number < 2) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        // Sayının bölen tarafından bölünebilir olup olmadığını kontrol edelim.
        if (number > divisor) {
            if (number % divisor == 0) {
                return false;
            }
        }

        // n'yi n'den küçük sayılara bölmeye çalışalım.
        // Eğer n'den küçük, 1'den büyük bir sayı n'yi tam bölüyorsa, n, tanımı gereği, asal olamaz.
        // Öyle bir sayı bulamazsak, n asaldır.

        // Daha küçük bölenlerle bölünebilirliği yinelemeli olarak kontrol edin
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = scan.nextInt();
        //isPrime(number,7);
        if(isPrime(number,7) && true) {
            System.out.println(number + " sayisi ASALDIR !");
        } else {
            System.out.println(number + " ASAL degildir !");
        }
    }
}
