public class HeadTeacher extends Teacher {
    private String department;
    private int teachersSupervised;
    private double allowance;

    public HeadTeacher(String name, int age, String idNumber,
                       String employeeId, String subject, double salary,
                       String department, int teachersSupervised, double allowance) {
        super(name, age, idNumber, employeeId, subject, salary);
        this.department = department;
        this.teachersSupervised = teachersSupervised;
        this.allowance = allowance;
        System.out.println("HeadTeacher constructor called");
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a " + department + " department meeting");
    }

    public double calculateTotalSalary() {
        return salary + allowance;
    }

    public void displayCompleteInfo() {
        System.out.println("=== Head Teacher Information ===");
        System.out.println("--- Basic Info (Person) ---");
        super.displayBasicInfo();

        System.out.println("--- Teacher Info (Teacher) ---");
        super.displayTeacherInfo();

        System.out.println("--- Head Teacher Info (HeadTeacher) ---");
        System.out.println("Department: " + department);
        System.out.println("Teachers Supervised: " + teachersSupervised);
        System.out.println("Allowance: $" + allowance);

        System.out.println("--- Total Salary ---");
        System.out.println("Total Salary (Salary + Allowance): $" + calculateTotalSalary());
    }
}