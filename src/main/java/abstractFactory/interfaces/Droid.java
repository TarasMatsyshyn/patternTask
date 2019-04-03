package abstractFactory.interfaces;

public interface Droid {

    default void move() {
        System.out.println("DroidModel is moving");
    }

}