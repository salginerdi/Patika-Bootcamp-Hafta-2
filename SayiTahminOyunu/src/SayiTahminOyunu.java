import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100); // 0 ile 100 arası rastgele sayı üretir.

        // bu da ikinci random sayı üretme yöntemidir.
        // double number = (int) (Math.random() * 100); // değerimizi integera çeviriyoruz.
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahminizi giriniz : ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz!");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan Hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Tekrar hatalı giriş yaparsanız hakkınız azalacaktır!");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, Doğru Tahmin! " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Yanlış sayı girdiniz");
                if (selected > number) {
                    System.out.println(selected + " girdiğiniz sayı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " girdiğiniz sayı gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }

        }
    }
}
