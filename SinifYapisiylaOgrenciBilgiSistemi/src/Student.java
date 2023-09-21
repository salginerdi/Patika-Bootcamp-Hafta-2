public class Student { // Öğrenci bilgileri notları ve sınıfı geçme durumunun yer aldığı bir sınıf oluşturduk.
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    // Öğrencinin bu bilgilerini class'a eşitleyen bir structure yapısı oluşturduk.
    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    // Öğrencinin sınav notlarının 0 ile 100 arasında olmasıyla ilgili bir metot oluşturduk
    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    // Öğrencinin sözlü sınav notlarının 0 ile 100 arasında olmasıyla ilgili bir metot oluşturduk
    public void addBulkExamOralNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.oralNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.oralNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.oralNote = kimya;
        }

    }

    // Öğrencinin dersleri geçme durumunu belirten bir metot oluşturduk.
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else if (this.mat.oralNote == 0 || this.fizik.oralNote == 0 || this.kimya.oralNote == 0)
            System.out.println("Notlar tam olarak girilmemiş");
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    // Öğrencinin sınav ve sözlü sınav ortalamasını hesaplayan bir metot oluşturduk
    public void calcAverage() {
        this.average = (((this.fizik.note * 0.80) + (this.fizik.oralNote * 0.20)) + ((this.kimya.note * 0.80) + (this.kimya.oralNote * 0.20)) + ((this.mat.note * 0.80) + (this.mat.oralNote * 0.20))) / 3;
    }

    // Öğrencinin ortalamasının geçme durumuna etkisi üzerine bir metot oluşturduk.
    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    // Öğrencinin adı soyadı, sınav ve sözlü sınav notlarını konsola bastıran bir metot oluşturduk.
    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.oralNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.oralNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.oralNote);
    }

}

