package abstractFactory.implementation;

import static abstractFactory.Utils.logInfo;

import abstractFactory.interfaces.Droid;

public class RepairDroidImpl implements Droid {
    public void repair() {
        logInfo("Repair droid repaired fight droid!");
    }
}
