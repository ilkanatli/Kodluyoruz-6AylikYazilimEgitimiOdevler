import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Değişkenlerimizi tanımlayalım.
        int n;

        // Kullanıcıdan basamak sayısını isteyelim.
        System.out.print("Basamak sayisini giriniz: ");
        n = scan.nextInt();

        // Döngü ile ters üçgen yapıyoruz.
        for (int i = n; i > 0; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
