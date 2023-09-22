import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz : ");
        int n = scanner.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Küçükten büyüğe sıralanmış hali : " + Arrays.toString(list));
    }


}

