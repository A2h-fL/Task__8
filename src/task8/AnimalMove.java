package task8;

public interface AnimalMove {
    default void move() {
        System.out.println(getClass().getSimpleName() + " moves somehow (general animal movement)");
    }
}
