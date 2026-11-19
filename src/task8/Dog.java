package task8;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "unknown";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "unknown");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog eats meat and dog food.");
    }

    @Override
    public String getVoice() {
        return "Woof woof!";
    }

    public void fetchBall() {
        System.out.println(getName() + " runs and brings the ball back.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the dog sleeps curled up in its bed.");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}
