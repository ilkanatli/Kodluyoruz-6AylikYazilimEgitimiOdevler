import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Scanner sınıfını tanımladık.
        int row, col;                           // Değişkenleri tanımladık satır ve sütun değerleri için.

        System.out.print("Dizinizin satir sayisini giriniz : ");  // Satır değerini kullanıcıdan alıyoruz.
        row = scan.nextInt();
        System.out.print("Dizinizin sutun sayisini giriniz : ");  // Sütun değerini kullanıcıdan alıyoruz.
        col = scan.nextInt();

        int[][] matris = new int[row][col];                        // Matrisimizi oluşturduk.
        int[][] transpoz = new int[col][row];                      // Transpozesi için satır ve sütunların yer değiştirmesi gerekli.

        for(int i = 0; i < row; i++){                              // Döngü ile matrisin içini dolduruyoruz.
            for(int j = 0; j < col; j++){
                System.out.print("Dizinizin " + (i + 1) + ". degerini giriniz : "); // Matrisin iç değerlerini kullanıcıdan alıyoruz.
                matris[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matris : "); // Matrisimizi ekrana bastırıyoruz.

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Trasnpozesi için matrisin içerisindeki değerleri aktarıyoruz.
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matrisin Transpozesi : "); // Transpozesini ekrana bastırıyoruz.

        for(int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
