package abstractFactory.implementation;

import static abstractFactory.Utils.logInfo;

import abstractFactory.interfaces.Droid;

public class TransportDroidImpl implements Droid {
    public void transport() {
        logInfo("Transport droid bring new equipment!");
    }
}
