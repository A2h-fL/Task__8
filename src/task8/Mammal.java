package task8;

public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        this.furColor = "unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the mammal eats food.");
    }

    @Override
    public String getVoice() {
        return "Some mammal sound";
    }

    public void feedBabies() {
        System.out.println(getName() + " feeds its babies with milk.");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", furColor='" + furColor + "'}";
    }
}
