package abstractFactory.interfaces;

import abstractFactory.DroidsTypes;
import abstractFactory.NoSuchDroidException;

public abstract class DroidFactory {

    public abstract Droid getDroid(DroidsTypes droidType) throws NoSuchDroidException;

}
