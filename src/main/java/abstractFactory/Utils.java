package abstractFactory;

import org.apache.log4j.Logger;

public class Utils {
    private static final Logger LOGGER = Logger.getLogger(decorator.Main.class.getName());

    public static void logInfo(String message){
        LOGGER.info(message);
    }
}
