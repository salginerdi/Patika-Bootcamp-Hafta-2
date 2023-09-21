public class Teacher { // Teacher class'ı tanımladık ve öğretmenin isim, telefon numarası ve branşını ekledik.
    String name;
    String mpno;
    String branch;

    // Bir structure yapısı kurarak sınıf bilgilerine atadık.
    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}