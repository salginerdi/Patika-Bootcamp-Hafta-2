import java.util.Scanner;

public class Desen {
    static int f(int n) {
        System.out.println(n);
        if (n <= 0) {
            int newResult = (n + 5);
            System.out.println(newResult);
            return newResult;
        }

        int result = f(n - 5);
        System.out.println(n + 5);
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = scanner.nextInt();
        n = f(n);
    }
}
