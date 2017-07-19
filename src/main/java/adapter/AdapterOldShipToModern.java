package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterOldShipToModern extends OldDroidShip implements ModernDroidShip {
    public AdapterOldShipToModern(List<Droid> droids) {
        super(new ArrayList<Droid>());
    }

    public void addDroid(Droid droid) {
        putDroid(droid);
    }

    public Droid getDroid(int index) {
        return droids.get(index) ;
    }
}
