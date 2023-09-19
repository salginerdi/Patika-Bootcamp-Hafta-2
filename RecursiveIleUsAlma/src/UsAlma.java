public class UsAlma {
    static int power(int taban, int kuvvet) {
        // taban ve kuvvet değişkenlerimizi belirledik.
        // kuvvetin 0 olduğu her durum için geriye 1 döner.
        if (kuvvet == 0) {
            return 1;
        }
        // başlangıçta sonuç değerimizi 1 veriyoruz.
        int sonuc = 1;

        // for döngüsüyle taban değerimizin kuvvet kere çarpılmasını sağlıyoruz.
        for (int i = 1; i <= kuvvet; i++) {
            sonuc *= taban;
        }
        // sonucu çağırıyoruz.
        return sonuc;
    }

    public static void main(String[] args) {
        // taban ve kuvvet değerlerimizi giriyoruz.
        System.out.println(power(3, 0));
    }
}
