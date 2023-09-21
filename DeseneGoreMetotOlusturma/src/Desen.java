import java.util.Scanner;

public class Desen {
    // recursive metot içerisinde koşullarımızı oluşturuyoruz.
    static int f(int n, int k) {
        System.out.println(n);
        // eğer değer 0 veya eksiye düşerse bu koşul sağlanıyor.
        if (n <= 0) {
            int newResult = (n + 5);
            System.out.println(newResult);
            // yeni sonucu çağırıyoruz.
            return newResult;
        }
        int result = f(n - 5, k);
        // kullanıcıdan aldığımız ve üzerinde işlem yaptığımız değer ilk değerden düşük olursa
        // if koşulu çalışıyor.
        if (n < k) {
            System.out.println(n + 5);
            return n;
        }
        // son olarak sonucu çağırıyoruz.
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = scanner.nextInt();
        // kullanıcıdan bir değer alıyoruz. Fonksiyon içindeki ilk n değeri bu değeri tutuyor
        // ve işlemlerimizi bunun üzerinden sağlıyoruz.
        n = f(n, n);

    }
}

}
