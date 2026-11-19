package task8;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];
        animals[0] = new Mammal();
        animals[1] = new Bird("Tweety", "yellow");
        animals[2] = new Fish("Nemo", 2, 0.3, "salt water");
        animals[3] = new Dog("Rex", 4, 20.5, "brown", "Labrador");
        animals[4] = new Dog("Max", "Husky");
        animals[5] = new Pigeon("Coco", 1, 0.4, "white", "Rock dove");
        animals[6] = new Blowfish("Bubbles", true);

        System.out.println("===== Task 1: toString, eat, getVoice =====");
        for (Animal a : animals) {
            System.out.println(a);
        }
        animals[3].eat();
        System.out.println(animals[3].getVoice());
        animals[5].eat();
        System.out.println(animals[5].getVoice());
        animals[6].eat();
        System.out.println(animals[6].getVoice());

        ((Dog) animals[3]).fetchBall();
        ((Pigeon) animals[5]).deliverMessage();
        ((Blowfish) animals[6]).inflate();
        ((Bird) animals[1]).layEggs();
        ((Fish) animals[2]).breatheUnderwater();
        ((Mammal) animals[0]).feedBabies();

        System.out.println("\n===== Interface 1: AnimalBehavior - sleep() =====");
        AnimalBehavior[] sleepers = new AnimalBehavior[3];
        sleepers[0] = new Dog("Rex", 4, 20.5, "brown", "Labrador");
        sleepers[1] = new Pigeon("Coco", 1, 0.4, "white", "Rock dove");
        sleepers[2] = new Blowfish("Bubbles", 3, 0.5, "salt water", true);

        sleepers[0].sleep();
        sleepers[1].sleep();
        sleepers[2].sleep();

        System.out.println("\n===== Interface 2: AnimalMove - move() =====");
        for (Animal a : animals) {
            a.move();
        }

        System.out.println("\n===== Interface 3: AnimalName - name() =====");
        for (Animal a : animals) {
            AnimalName.name(a.getName());
        }
    }
}
