package abstractFactory.implementation;

import static abstractFactory.Utils.logInfo;

import abstractFactory.interfaces.Droid;

public class BattleDroidImpl implements Droid {

    public void fight() {
        logInfo("Battle droid is fighting now!");
    }
}
