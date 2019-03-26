package prototype;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(decorator.Main.class.getName());

    public static void main(String[] args) {
        Droid droid = new Droid("R2D2", 150, 200);
        DroidCloneFactory cloneFactory = new DroidCloneFactory(droid);
        Droid cloneDroid = cloneFactory.cloneDroid();
        LOGGER.info(droid);
        cloneDroid.setArmor(50);
        LOGGER.info(cloneDroid);
    }
}
