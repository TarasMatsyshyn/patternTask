package adapter;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(decorator.Main.class.getName());

    public static void main(String[] args) {
        ModernDroidShip ship = new AdapterOldShipToModern(null);
        ship.addDroid(new Droid("B2", 340, 2015));
        LOGGER.info(ship.getDroid(0));
    }
}
