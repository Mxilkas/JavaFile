public class Person {
    protected String name;
    protected int age;
    protected String idNumber;

    public Person(String name, int age, String idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        System.out.println("Person constructor called");
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID Number: " + idNumber);
    }
}