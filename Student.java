public class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String name, int age, String idNumber, String studentId, double gpa) {
        super(name, age, idNumber);
        this.studentId = studentId;
        this.gpa = gpa;
        System.out.println("Student constructor called");
    }

    public void displayAcademicInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
    }
}