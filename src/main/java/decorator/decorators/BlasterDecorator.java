package decorator.decorators;

import decorator.Blaster;

public class BlasterDecorator implements Blaster {
    protected Blaster blaster;

    public BlasterDecorator(Blaster blaster) {
        this.blaster = blaster;
    }

    public void shoot() {
        blaster.shoot();
    }
}
