public class Course { // Derslerle ilgili isim, kod, isim kodu, sınav notu, sözlü sınav notu ve öğretmen sınıfını da içeren bir sınıf oluşturduk.
    Teacher courseTeacher;
    String name;
    String code;
    String prefix; // Dersin isim kodu "Ör: TRH" // öğretmen branchiyle aynı olması lazım.
    int note;
    int oralNote;

    // Bu bilgileri sınıf bilgileriyle eşleyen bir structure yapısı oluşturduk.
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;
    }

    // Öğretmenlerin alanıyla dersin isim kodunun eşliğini kontrol eden bir metot oluşturduk.
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    // Öğretmenin alanıyla ilgili bilgiyi konsola yazdıran bir metot oluşturduk. hakkında bilgi veren bir metot oluşturduk.
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}


