public class Bird extends Animal {
    private double wingSpan;
    private boolean canFly;

    public Bird(String name, int age, String color, double weight, double wingSpan, boolean canFly) {
        super(name, age, color, weight);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Chirp! Chirp!");
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying with wingspan of " + wingSpan + " cm");
        } else {
            System.out.println(name + " cannot fly (flightless bird)");
        }
    }

    public void buildNest() {
        System.out.println(name + " is building a nest");
    }

    public void displayBirdInfo() {
        displayInfo();
        System.out.println("Wing Span: " + wingSpan + " cm");
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}
