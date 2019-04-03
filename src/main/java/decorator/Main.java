package decorator;

import decorator.decorators.AutoRechargedBlasterDecorator;
import decorator.decorators.GrenadeBlasterDecorator;

public class Main {

    public static void main(String[] args) {
        Blaster blaster = new GrenadeBlasterDecorator(new AutoRechargedBlasterDecorator(new BlasterImpl()));
        blaster.shoot();
    }
}
