public class Main {
    public static void main(String[] args){

        System.out.println("1-100 arasindaki asal sayilar:");

        // n'yi n'den küçük sayılara bölmeye çalışalım.
        // Eğer n'den küçük, 1'den büyük bir sayı n'yi tam bölüyorsa, n, tanımı gereği, asal olamaz.
        // Öyle bir sayı bulamazsak, n asaldır.
        // Başta sayımızı asal olarak kabul edelim.

        for (int i = 2; i <= 100; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
          if (asal){
                System.out.print(i + " ");
            }
        }
    }
}
