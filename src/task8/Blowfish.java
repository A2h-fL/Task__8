package task8;

public class Blowfish extends Fish implements AnimalBehavior {
    private boolean poisonous;

    public Blowfish() {
        super();
        this.poisonous = true;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, boolean poisonous) {
        super(name, "salt water");
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish eats small crabs and snails.");
    }

    @Override
    public String getVoice() {
        return "Blub blub";
    }

    public void inflate() {
        System.out.println(getName() + " inflates into a big ball to scare predators!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the blowfish rests quietly near the sea bed.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", poisonous=" + poisonous + "}";
    }
}
