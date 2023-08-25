import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> mainList = new ArrayList<Integer>();
    static ArrayList<Integer> evenList = new ArrayList<Integer>();
    static ArrayList<Integer> oddList = new ArrayList<Integer>();

    public static void main(String[] args) {

        // 1'den 10000'e kadar olan sayıları ana listeye ekle

        for (int i = 1; i <= 10000; i++) {
            mainList.add(i);
        }

        // ana listeyi 4 eşit parçaya ayır

        ArrayList<ArrayList<Integer>> subLists = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 4; i++) {
            subLists.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < mainList.size(); i++) {
            subLists.get(i % 4).add(mainList.get(i));
        }

        // 4 Thread

        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(new MyThread(subLists.get(i), evenList, oddList));
            thread.start();
        }

        // Çift sayılar

        System.out.println("Cift sayilar: " + evenList);

        // Tek sayılar

        System.out.println("Tek sayilar: " + oddList);
    }
}

