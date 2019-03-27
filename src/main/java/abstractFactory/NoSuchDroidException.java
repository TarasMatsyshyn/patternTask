package abstractFactory;

public class NoSuchDroidException extends Exception {

    public NoSuchDroidException() {
        super("No such droid type!!!");
    }
}
