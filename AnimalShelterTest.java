public class AnimalShelterTest {

    private static void printLine() {
        System.out.println("------------------------------------------------------------");
    }

    private static void printTitle(String title) {
        printLine();
        System.out.println(title);
        printLine();
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Max", 3, "Brown", 18.5, "German Shepherd", true);
        Cat cat = new Cat("Whiskers", 2, "White", 4.2, true, 9);
        Bird bird = new Bird("Tweety", 1, "Yellow", 0.35, 25.5, true);

        // ===================== DOG =====================
        printTitle("🐶 ANIMAL SHELTER SYSTEM - DOG PROFILE");
        System.out.println("Animal Type : Dog");
        System.out.println("Animal Name : " + dog.name);
        printLine();
        System.out.println(">> Details");
        dog.displayDogInfo();
        printLine();
        System.out.println(">> Actions");
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.fetch();
        dog.guardHouse();

        // ===================== CAT =====================
        printTitle("🐱 ANIMAL SHELTER SYSTEM - CAT PROFILE");
        System.out.println("Animal Type : Cat");
        System.out.println("Animal Name : " + cat.name);
        printLine();
        System.out.println(">> Details");
        cat.displayCatInfo();
        printLine();
        System.out.println(">> Actions");
        cat.eat();
        cat.sleep();
        cat.makeSound();
        cat.scratch();
        cat.climb();

        // ===================== BIRD =====================
        printTitle("🐦 ANIMAL SHELTER SYSTEM - BIRD PROFILE");
        System.out.println("Animal Type : Bird");
        System.out.println("Animal Name : " + bird.name);
        printLine();
        System.out.println(">> Details");
        bird.displayBirdInfo();
        printLine();
        System.out.println(">> Actions");
        bird.eat();
        bird.sleep();
        bird.makeSound();
        bird.fly();
        bird.buildNest();

        printTitle("✅ END OF TEST - ALL ANIMALS DISPLAYED SUCCESSFULLY");
    }
}
