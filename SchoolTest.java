public class SchoolTest {
    public static void main(String[] args) {

        System.out.println("========== PART A: STUDENTS (Single Inheritance) ==========");

        Student s1 = new Student("Ahmed Ali", 19, "P-1001", "S-2025-01", 3.65);
        System.out.println("\n--- Student 1 ---");
        s1.displayBasicInfo();
        s1.displayAcademicInfo();

        System.out.println();

        Student s2 = new Student("Hodan Yusuf", 21, "P-1002", "S-2025-02", 3.92);
        System.out.println("\n--- Student 2 ---");
        s2.displayBasicInfo();
        s2.displayAcademicInfo();

        System.out.println("\n\n========== PART B: HEAD TEACHER (Multilevel Inheritance) ==========");

        HeadTeacher ht = new HeadTeacher(
                "Shuab Daud", 35, "P-5001",
                "T-9001", "OOP Java", 2500.0,
                "Computer Science", 12, 400.0
        );

        System.out.println();
        ht.teach();
        ht.conductMeeting();
        System.out.println();
        ht.displayCompleteInfo();
    }
}