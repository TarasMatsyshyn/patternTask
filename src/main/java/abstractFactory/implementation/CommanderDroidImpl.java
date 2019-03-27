package abstractFactory.implementation;

import static abstractFactory.Utils.logInfo;

import abstractFactory.interfaces.Droid;

public class CommanderDroidImpl implements Droid {
    public void command() {
        logInfo("Command droid control situation!");
    }
}
