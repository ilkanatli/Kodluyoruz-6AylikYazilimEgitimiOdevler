import java.util.Scanner;

public class Main {
    static void pattern(int n) {

        if (n <= 0) {                     // 0 yada negatif değer görünce
            System.out.print(n + " ");    // değeri bir kez yazdır
            return;                       // fonksiyondan çıkış.
        }

        System.out.print(n + " "); // İlk değer başa

        pattern(n-5);           // 5 eksilterek kendini çağır fonksiyonun

        System.out.print(n + " "); // ilk değer sona
    }

    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayisini giriniz: ");
        N = input.nextInt();

        pattern(N);

            /*
            pattern(16)
            16 pattern(11) 16
            16 11 pattern(6) 11 16
            16 11 6 pattern(1) 6 11 16
            16 11 6 1 pattern(-4) 1 6 11 16
            16 11 6 1 -4 1 6 11 16
            */
    }
}
