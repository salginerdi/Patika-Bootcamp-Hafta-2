public class Main {
    public static void main(String[] args) {
        // derslerimizin isimlerini, kodlarını ve isim kodlarını tanımladık.
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        // öğretmenlerin isimlerini, telefon numaralarını ve branşlarını tanımladık.
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        // bu bilgileri metotlara gönderdik.
        mat.addTeacher(t1);
        mat.printTeacher();
        fizik.addTeacher(t2);
        fizik.printTeacher();
        kimya.addTeacher(t3);
        kimya.printTeacher();

        // Öğrenci ismi, sınıfı, öğrenci no'su ve ilgili derslerini tanımladık
        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40);
        s1.addBulkExamOralNote(80, 90, 90);
        s1.isPass(); // geçme durumunu kontrol etmek için metotlara atadık.

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkExamOralNote(80, 90, 90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkExamOralNote(80, 90, 90);
        s3.isPass();

    }
}

