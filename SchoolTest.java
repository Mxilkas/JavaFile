public class SchoolTest {

    private static void line() {
        System.out.println("============================================================");
    }

    private static void section(String title) {
        System.out.println();
        line();
        System.out.println(title);
        line();
    }

    public static void main(String[] args) {

        // ==========================
        // PART A: Single Inheritance
        // ==========================
        section("🏫 EXERCISE 1 - PART A: SINGLE INHERITANCE (Person -> Student)");

        System.out.println("Creating Student #1...");
        Student s1 = new Student("Ahmed Ali", 19, "P-1001", "S-2025-01", 3.65);

        System.out.println("\n--- Student #1 Profile ---");
        s1.displayBasicInfo();
        System.out.println("--- Academic Info ---");
        s1.displayAcademicInfo();

        System.out.println("\nCreating Student #2...");
        Student s2 = new Student("Hodan Yusuf", 21, "P-1002", "S-2025-02", 3.92);

        System.out.println("\n--- Student #2 Profile ---");
        s2.displayBasicInfo();
        System.out.println("--- Academic Info ---");
        s2.displayAcademicInfo();

        // ==========================
        // PART B: Multilevel Inheritance
        // ==========================
        section("👩‍🏫 EXERCISE 1 - PART B: MULTILEVEL INHERITANCE (Person -> Teacher -> HeadTeacher)");

        System.out.println("Creating HeadTeacher (Constructor Chain should print in correct order):");
        line();

        HeadTeacher ht = new HeadTeacher(
                "Shuab Daud", 35, "P-5001",
                "T-9001", "OOP Java", 2500.0,
                "Computer Science", 12, 400.0
        );

        line();
        System.out.println("\n>> Role Actions");
        ht.teach();
        ht.conductMeeting();

        System.out.println("\n>> Full Profile (All 3 Levels)");
        ht.displayCompleteInfo();

        section("✅ END OF EXERCISE 1 TEST");
    }
}
