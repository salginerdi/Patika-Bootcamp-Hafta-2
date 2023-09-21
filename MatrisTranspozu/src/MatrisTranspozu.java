public class MatrisTranspozu {
    public static void main(String[] args) {
        // Matrisi oluşturuyoruz.
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        // Transpoz matrisin boyutunu oluşturuyoruz.
        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        // Matrisin transpozunu hesaplıyoruz.
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Transpoz matrisi konsola yazdırıyoruz.
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}

