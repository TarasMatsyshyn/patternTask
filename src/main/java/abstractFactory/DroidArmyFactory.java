package abstractFactory;

public interface DroidArmyFactory {
    TransportDroid getTransportDroid();
    RepairDroid getRepairDroid();
    CommandingDroid getCommandingDroid();
    BattleDroid getBattleDroid();
}
