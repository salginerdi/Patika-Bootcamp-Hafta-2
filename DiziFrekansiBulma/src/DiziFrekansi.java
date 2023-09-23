public class DiziFrekansi {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Elemanların frekanslarını tutacak bir dizi oluşturuyoruz.
        int[] frekanslar = new int[dizi.length];

        // Elemanları döngü ile kontrol ederek frekansları hesaplıyoruz.
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            if (frekanslar[i] == -1) {
                continue; // Daha önce işlendiği için continue kullanıyoruz.
            }

            int frekans = 1; // Elemanın kendi frekansını tanımlıyoruz.
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                    frekanslar[j] = -1; // İşlendi olarak işaretliyoruz.
                }
            }

            // Sonucu ekrana yazdırıyoruz.
            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
