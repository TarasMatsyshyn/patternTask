package decorator.decorators;

import decorator.Blaster;

public class GrenadeBlasterDecorator extends BlasterDecorator {
    public GrenadeBlasterDecorator(Blaster blaster) {
        super(blaster);
    }

    public void shootingWithGrenade() {
        System.out.println("Blaster shooting with grenade");
    }

    @Override
    public void shoot() {
        super.shoot();
        shootingWithGrenade();
    }
}
