import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri alalım.
        int birthYear;
        String horoscope = "";

        // Scanner sınıfımızı tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan doğum yılını girmesini isteyelim.
        System.out.print("Dogum yilinizi giriniz: ");
        birthYear = scan.nextInt();

        switch (birthYear % 12) {
            case 0:
                horoscope = "Maymun";
                break;
            case 1:
                horoscope = "Horoz";
                break;
            case 2:
                horoscope = "Kopek";
                break;
            case 3:
                horoscope = "Domuz";
                break;
            case 4:
                horoscope = "Fare";
                break;
            case 5:
                horoscope = "Okuz";
                break;
            case 6:
                horoscope = "Kaplan";
                break;
            case 7:
                horoscope = "Tavsan";
                break;
            case 8:
                horoscope = "Ejderha";
                break;
            case 9:
                horoscope = "Yilan";
                break;
            case 10:
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
            default:
                System.out.println("Lutfen gecerli bir dogum yili giriniz!");
        }
        System.out.println("Cin Zodyagi Burcunuz: " + horoscope);
    }
}
