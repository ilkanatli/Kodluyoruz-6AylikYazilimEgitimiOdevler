import java.util.Scanner;

public class Main {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (base == 1) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        int num1 = scan.nextInt();
        System.out.print("Us degerini giriniz: ");
        int num2 = scan.nextInt();
        System.out.println(power(2,3));

        // pow(2,3) => 2 * pow(2,2) -> 8
        // pow(2,2) => 2 * pow(2,1) -> 4
        // pow(2,1) => 2 * pow(2,0) -> 2
        // pow(2,0) => 1

    }
}
