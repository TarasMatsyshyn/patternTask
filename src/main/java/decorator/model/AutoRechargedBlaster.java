package decorator.model;

public class AutoRechargedBlaster extends BlasterDecorator {
    public AutoRechargedBlaster(Blaster blaster) {
        super(blaster);
    }

    public String autoRechargering() {
        return " Blaster rechargered now -";
    }

    @Override
    public String shoot() {
        return super.shoot() + autoRechargering();
    }
}
