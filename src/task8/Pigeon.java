package task8;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon() {
        super();
        this.species = "unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon eats crumbs in the park.");
    }

    @Override
    public String getVoice() {
        return "Coo coo";
    }

    public void deliverMessage() {
        System.out.println(getName() + " carries a message to another city.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the pigeon sleeps on a rooftop.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon fly");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", species='" + species + "'}";
    }
}
