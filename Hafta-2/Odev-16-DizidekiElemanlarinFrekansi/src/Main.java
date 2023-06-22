import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){  // Eşleşen değerlerin kontrolünü sağlıyoruz.
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};          // Dizimizi tanımladık.
        int[] duplicate = new int[list.length];                // Tekrar eden sayılar için bir dizi tanımladık.
        int indexNumber = 0;                                   // Dizi indexi için bir değişken tanımladık.
        int counter = 0;                                       // Tekarar eden sayılar için bir sayaç belirledik.

        System.out.println("Dizi: " + Arrays.toString(list)); // Dizimizi ekrana yazdırıyoruz.
        System.out.println("Tekrar Sayilari ");

        for (int i = 0; i < list.length; i++) {                // Döngü ile dizideki elemanları geziyoruz.
            counter = 0;
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    counter++;
                }
            }
            if (!isFind(duplicate, list[i])) {
                System.out.println(list[i] + " sayisi " + (counter + 1) + " kere tekrar edildi.");
                duplicate[indexNumber++] = list[i];
            }
        }
    }
}
