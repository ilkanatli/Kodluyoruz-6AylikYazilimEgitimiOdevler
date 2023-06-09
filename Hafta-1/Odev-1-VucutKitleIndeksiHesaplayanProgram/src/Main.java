import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri alalım.
        double kilo, boy, vucutKitleIndeksi;

        // Scanner sınıfını tanımlayalım.
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan boy ve kilosunu girmesini isteyelim.
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vucut Kitle Indeksiniz : " + vucutKitleIndeksi);
    }
}
