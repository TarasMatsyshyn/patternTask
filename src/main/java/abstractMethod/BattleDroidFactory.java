package abstractMethod;

public class BattleDroidFactory implements DroidFactory {
    public Droid createDroid() {
        return new BattleDroid();
    }
}
