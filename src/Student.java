public class Student {
    private String name;
    private double gpa;
    private int age;
    public Student(String studentName, double studentGpa, int studentAge) {
        name = studentName;
        gpa = studentGpa;
        age = studentAge;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Age: " + age);
    }

    public void checkGraduate(){
        if (age >= 18) {
            if (gpa >= 2.0) {
                System.out.println("They can graduate successfully");
            } else {
                System.out.println("They are at risk of being held back");
            }
        } else {
            System.out.println("They are not old enough to graduate unless they skip years");
        }
    }
}
