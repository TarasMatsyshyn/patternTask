package decorator.decorators;

import decorator.Blaster;

public class AutoRechargedBlasterDecorator extends BlasterDecorator {

    public AutoRechargedBlasterDecorator(Blaster blaster) {
        super(blaster);
    }

    public void autoRecharge() {
        System.out.println("Blaster recharged");
    }

    @Override
    public void shoot() {
        super.shoot();
        autoRecharge();
    }
}
