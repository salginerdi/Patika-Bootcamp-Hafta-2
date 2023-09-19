import java.util.Scanner;

public class AsalSayi {
    static boolean IsPrime(int number) {
        // boolean bir veri tipi oluşturuyoruz.
        // başlangıç değeri 0 olan bir sayaç tanımlıyoruz
        int counter = 0;

        // asal sayılar 2'den başladığı için i değerimizi 2'den başlatıyoruz.
        for (int i = 2; i < number; i++) {
            // kullanıcının girdiği sayının herhangi bir sayıya tam bölünüp bölünmediğini kontrol ediyoruz.
            if (number % i == 0)
                // bu sonucu sayacımızda(counter) tutuyoruz.
                counter++;
        }
        // sayacımız 0 sonucunu verirse bölünüyordur ve boolean değerimiz true döner.
        if (counter == 0) {
            return true;
        } else { // sayacımız 0 değilse boolean değerimiz false döner.
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Scanner nesnesiyle kullanıcıdan bir sayı alıyoruz.
        System.out.print("Bir sayi giriniz: ");
        int number = scan.nextInt();

        if (IsPrime(number)) { // değerimiz if koşulunu sağlıyorsa asal
            System.out.println("Girilen sayi asal bir sayidir.");
        } else { // sağlamıyorsa asal değildir.
            System.out.println("Girilen sayi asal bir sayi degildir.");
        }

    }
}
