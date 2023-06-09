import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Değişkenimizi tanımlıyoruz.
        int n;

        //  Kullanıcıdan değişkenimizi istiyoruz.
        System.out.print("Kac tane sayi gireceksiniz: ");
        n = scan.nextInt();

        int i = 1, sayi, max = 0, min = 0;
        boolean control = true;

        // Döngü ile min ve max sayıyı bulduruyoruz.
        while (i <= n) {
            System.out.print(i + ".inci sayiyi giriniz: ");
            sayi = scan.nextInt();
            if (control) {
                min = sayi;
                max = sayi;
                control = false;
            } else {
                if (sayi < min) {
                    min = sayi;
                }
                if (sayi > max) {
                    max = sayi;
                }
            }
            i++;
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }
}
