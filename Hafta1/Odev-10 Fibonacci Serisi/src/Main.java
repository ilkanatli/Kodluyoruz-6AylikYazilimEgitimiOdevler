import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlıyoruz.
        int  number, num1 = 0, num2 = 1, num3;
        // Scanner sınıfımızı tanımlıyoruz.
        Scanner scan = new Scanner(System.in);
        // Kullanıcıdan eleman sayısını istiyoruz.
        System.out.print("Fibonacci serisi eleman sayisi: ");
        number = scan.nextInt();

        System.out.print(num1 + " " + num2); // Serinin ilk iki sayısını girerek başılıyoruz.
        for(int i = 2; i <= number; i++) {   // Döngü ile seriyi oluşturuyoruz.
            num3 = num1 + num2;              // Her sayıyı kendinden önceki sayı ile toplayarak seriyi oluşturuyoruz.
            System.out.print(" " + num3);
            num1 = num2;                     // Kendinden bir sonraki sayıya eşitleyerek serinin devamını sağlıyoruz.
            num2 = num3;                     // Kendinden bir sonraki sayıya eşitleyerek serinin devamını sağlıyoruz.
        }
    }
}
