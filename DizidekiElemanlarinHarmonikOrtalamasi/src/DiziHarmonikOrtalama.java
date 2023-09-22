public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        int[] list = {2, 4, 6, 8, 10, 12};

        double sum = 0.0; // sum değişkenini ondalık bir sayı olarak tanımlıyoruz.

        for (int i = 0; i < list.length; i++) {
            sum += 1.0 / list[i]; // Her elemanın tersini alıyoruz ve toplama ekliyoruz.
        }

        double average = list.length / sum; // list.length'i ondalık bir sayıya çeviriyoruz.

        System.out.println(average);
    }
}
