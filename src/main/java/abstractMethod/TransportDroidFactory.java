package abstractMethod;

public class TransportDroidFactory implements DroidFactory {
    public Droid createDroid() {
        return new TransportDroid();
    }
}
