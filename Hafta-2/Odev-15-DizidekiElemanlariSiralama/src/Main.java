import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu girmesini isteyelim.
        System.out.print("Dizinin boyutu n  : ");
        int n = scan.nextInt();

        // Diziyi tanımladık.
        int[] list = new int[n];

        // Kullanıcıdan eleman sayısını istedik.
        System.out.println("Dizinin elemanlarini giriniz  : ");

        // Döngü ile dizimize elemanlarını atıyoruz.
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            list[i] = number;
            System.out.println((i + 1) + ". Elemani: " + number);
        }

        // Dizimizi sıralıyoruz.
        Arrays.sort(list);
        // Sıraladığımız diziyi ekrana bastırıyoruz.
        System.out.println("Siralama : " + Arrays.toString(list));
    }
}
