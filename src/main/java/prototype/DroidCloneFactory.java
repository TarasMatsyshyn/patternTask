package prototype;

public class DroidCloneFactory {
    Droid droid;

    public DroidCloneFactory(Droid droid) {
        this.droid = droid;
    }

    public void setDroid(Droid droid) {
        this.droid = droid;
    }

    Droid cloneDroid(){
        return (Droid) droid.copy();
    }
}
