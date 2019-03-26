package decorator.model;

public class GrenadeAutoRechargeredBlaster extends BlasterDecorator {
    public GrenadeAutoRechargeredBlaster(Blaster blaster) {
        super(blaster);
    }

    public String shootingWithGrenade() {
        return " Blaster shooting with grenade";
    }

    @Override
    public String shoot() {
        return super.shoot() + shootingWithGrenade();
    }
}
