import java.util.Scanner;
import java.util.Arrays;

public class EnBuyukVeKucukSayi {
    public static void main(String[] args) {
        // Dizimizi oluşturuyoruz.
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};


        // Kullanıcıdan bir sayı almak içim scanner nesnesi oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");

        // Aldığımız sayıyı choiceNumber değişkenine atıyoruz.
        int choiceNumber = scanner.nextInt();

        // sort() metoduyla dizimizi küçükten büyüğe doğru sıralıyoruz.
        Arrays.sort(list);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;


        // foreach döngüsü oluşturuyoruz.
        for (int i : list) {
            // eğer kullanıcının girdiği sayı en küçük integer değerinden ve iteratör sayısından
            // büyük ise enYakinKucuk değerimize iteratör sayımızı atıyoruz.
            if (i < choiceNumber && i > min) {
                min = i;

                // eğer kullanıcının girdiği sayı en büyük integer değerinden ve iteratör sayısından
                // küçük ise enYakinBuyuk değerimize iteratör sayımızı atıyoruz.
            }
            if (i > choiceNumber && i < max) {
                max = i;
            }
        }

        // Bu koşulda en küçük en yakın sayıyı veriyor.
        if (min != Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        // bu koşulda da en büyük en yakın sayıyı veriyor.
        if (max != Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }
    }
}


