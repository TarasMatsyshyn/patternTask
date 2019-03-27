package abstractFactory;

import abstractFactory.implementation.BattleDroidImpl;
import abstractFactory.implementation.DroidFactoryImpl;
import abstractFactory.interfaces.Droid;

public class Main {

    public static void main(String[] args) throws NoSuchDroidException {
        DroidFactoryImpl factory = new DroidFactoryImpl();
        Droid battleDroid = factory.getDroid(DroidsTypes.BATTLE_DROID);
        ((BattleDroidImpl)battleDroid).fight();
    }
}
