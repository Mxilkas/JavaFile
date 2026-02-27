public class Teacher extends Person {
    protected String employeeId;
    protected String subject;
    protected double salary;

    public Teacher(String name, int age, String idNumber,
                   String employeeId, String subject, double salary) {
        super(name, age, idNumber);
        this.employeeId = employeeId;
        this.subject = subject;
        this.salary = salary;
        System.out.println("Teacher constructor called");
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    public void displayTeacherInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + salary);
    }
}