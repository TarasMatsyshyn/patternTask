package abstractFactory;

import abstractFactory.implementation.DroidArmyFactoryImpl;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(decorator.Main.class.getName());
    public static void main(String[] args) {
        DroidArmyFactory armyFactory = new DroidArmyFactoryImpl();
        LOGGER.info(armyFactory.getBattleDroid().fight());
        LOGGER.info(armyFactory.getRepairDroid().repair());
        LOGGER.info(armyFactory.getTransportDroid().transporting());
        LOGGER.info(armyFactory.getCommandingDroid().command());

    }
}
