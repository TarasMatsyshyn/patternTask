package abstractFactory.implementation;

import abstractFactory.*;

public class DroidArmyFactoryImpl implements DroidArmyFactory{
    public TransportDroid getTransportDroid() {
        return new TransportDroidImpl();
    }

    public RepairDroid getRepairDroid() {
        return new RepairDroidImpl();
    }

    public CommandingDroid getCommandingDroid() {
        return new CommandingDroidImpl();
    }

    public BattleDroid getBattleDroid() {
        return new BattleDroidImpl();
    }
}
