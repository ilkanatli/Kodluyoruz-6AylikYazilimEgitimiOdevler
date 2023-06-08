import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım.
        int distance, age, tripType;
        double perDistance = 0.10, totalPrice = 0;
        // tripType = 1 => Tek Yön, tripType = 2 => Gidiş-Dönüş

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan değerleri isteyelim.

        System.out.print("Gideceginiz mesafeyi giriniz(KM): ");
        distance = scan.nextInt();
        System.out.print("Yasinizi giriniz: ");
        age = scan.nextInt();
        System.out.print("Tek yon gidis mi, donus mu? ");
        tripType = scan.nextInt();

        // double total = (distance * 0.10);
        // System.out.println("Toplam tutar: " + total);

        totalPrice = distance * 0.10;

        if ((distance > 0 && age > 0) && (tripType == 1 || tripType == 2)) {
            if (age < 12) {
                if (tripType == 1) {
                    totalPrice -= totalPrice * 0.5;
                    System.out.println("Toplam tutar: " + totalPrice);
                } else {
                    totalPrice -= totalPrice * 0.5;
                    totalPrice -= totalPrice * 0.2;
                    totalPrice *= 2;
                    System.out.println("Toplam tutar: " + totalPrice);
                }
            } else if (age >= 12 && age <= 24) {
                if (tripType == 1) {
                    totalPrice -= totalPrice * 0.1;
                    System.out.print("Bilet Fiyatiniz: " + totalPrice);
                } else {
                    totalPrice -= totalPrice * 0.1;
                    totalPrice -= totalPrice * 0.2;
                    totalPrice *= 2;
                    System.out.print("Bilet Fiyatiniz: " + totalPrice);
                }
            } else if (age >= 65) {
                if (tripType == 1) {
                    totalPrice -= totalPrice * 0.3;
                    System.out.print("Bilet Fiyatiniz: " + totalPrice);
                } else {
                    totalPrice -= totalPrice * 0.3;
                    totalPrice -= totalPrice * 0.2;
                    totalPrice *= 2;
                    System.out.print("Bilet Fiyatiniz: " + totalPrice);
                }
            } else {
                if (tripType == 1) {
                    totalPrice = totalPrice;
                    System.out.print("Bilet Fiyatiniz: " + totalPrice);
                } else {
                    totalPrice *= 2;
                    System.out.print("Bilet Fiyatiniz: " + totalPrice);
                }
            }
        } else {
            System.out.println("Hatali veri girdiniz!");
        }
    }
}
