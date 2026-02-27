public class Cat extends Animal {
    private boolean isIndoor;
    private int livesRemaining;

    public Cat(String name, int age, String color, double weight, boolean isIndoor, int livesRemaining) {
        super(name, age, color, weight);
        this.isIndoor = isIndoor;
        this.livesRemaining = livesRemaining;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }

    public void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }

    public void climb() {
        System.out.println(name + " is climbing");
    }

    public void displayCatInfo() {
        displayInfo();
        System.out.println("Indoor Cat: " + (isIndoor ? "Yes" : "No"));
        System.out.println("Lives Remaining: " + livesRemaining);
    }
}
