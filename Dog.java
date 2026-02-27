public class Dog extends Animal {
    private String breed;
    private boolean isTrained;

    public Dog(String name, int age, String color, double weight, String breed, boolean isTrained) {
        super(name, age, color, weight);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    public void guardHouse() {
        if (isTrained) {
            System.out.println(name + " is guarding the house");
        } else {
            System.out.println(name + " needs training to guard");
        }
    }

    public void displayDogInfo() {
        displayInfo();
        System.out.println("Breed: " + breed);
        System.out.println("Trained: " + (isTrained ? "Yes" : "No"));
    }
}
