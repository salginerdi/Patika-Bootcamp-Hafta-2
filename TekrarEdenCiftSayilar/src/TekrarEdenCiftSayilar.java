import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        // Dizideki tekrar eden çift sayıları bulmak için bir dizi kullanabiliriz.
        int[] duplicateEven = new int[list.length];
        int duplicateCount = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate && list[i] % 2 == 0) {
                duplicateEven[duplicateCount] = list[i];
                duplicateCount++;
            }
        }

        // Sonucu temizlemek için gereksiz sıfırları kaldırabiliriz.
        duplicateEven = Arrays.copyOf(duplicateEven, duplicateCount);

        System.out.println(Arrays.toString(duplicateEven));
    }
}
