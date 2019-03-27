package abstractFactory.implementation;

import abstractFactory.DroidsTypes;
import abstractFactory.NoSuchDroidException;
import abstractFactory.interfaces.Droid;
import abstractFactory.interfaces.DroidFactory;

public class DroidFactoryImpl extends DroidFactory {

    public Droid getDroid(DroidsTypes droidType) throws NoSuchDroidException {
        switch (droidType) {
            case BATTLE_DROID:
                return new BattleDroidImpl();
            case REPAIR_DROID:
                return new RepairDroidImpl();
            case TRANSPORT_DROID:
                return new TransportDroidImpl();
            case COMMANDER_DROID:
                return new CommanderDroidImpl();
            default:
                throw new NoSuchDroidException();
        }
    }

}
