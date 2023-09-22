// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Tyler", 2.6, 18);
        student1.printStudentInfo();
        student1.checkGraduate();

        Student student2 = new Student("Robert", 1.9, 18);
        student2.printStudentInfo();
        student2.checkGraduate();

        Student student3 = new Student("Barry", 4.0, 16);
        student3.printStudentInfo();
        student3.checkGraduate();
    }
}