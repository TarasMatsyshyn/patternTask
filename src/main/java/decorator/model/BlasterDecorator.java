package decorator.model;

public class BlasterDecorator implements Blaster {
    protected Blaster blaster;

    public BlasterDecorator(Blaster blaster) {
        this.blaster = blaster;
    }

    public String shoot() {
        return blaster.shoot();
    }
}
