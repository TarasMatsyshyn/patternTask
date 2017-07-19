package adapter;

import java.util.ArrayList;
import java.util.List;

public class OldDroidShip {
    protected List<Droid> droids = new ArrayList<Droid>();

    public OldDroidShip(List<Droid> droids) {
        this.droids = droids;
    }

    public void putDroid(Droid droid) {
        droids.add(droid);
    }

    public Droid takeDroid(int index) {
        return droids.get(index);
    }

}
