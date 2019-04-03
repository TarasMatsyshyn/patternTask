package prototype;

public class DroidCloneFactory {
    public Droid droid;

    public DroidCloneFactory(Droid droid) {
        this.droid = droid;
    }

    public void setDroid(Droid droid) {
        this.droid = droid;
    }

    public Droid cloneDroid() {
        return (Droid) droid.copy();
    }
}
