package decorator;

import decorator.model.AutoRechargedBlaster;
import decorator.model.Blaster;
import decorator.model.GrenadeAutoRechargeredBlaster;
import decorator.model.SimpleBlaster;
import org.apache.log4j.Logger;

public class Main {
    private  static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Blaster blaster = new GrenadeAutoRechargeredBlaster(new AutoRechargedBlaster(new SimpleBlaster()));
        LOGGER.info(blaster.shoot());
    }
}
