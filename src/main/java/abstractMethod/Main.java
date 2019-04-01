package abstractMethod;

public class Main {
    public static void main(String[] args) {
        DroidFactory droidFactory = createDroidBySpeciality("BattleDroid");
        Droid droid = droidFactory.createDroid();
        droid.work();
    }

    public static DroidFactory createDroidBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("BattleDroid")) {
            return new BattleDroidFactory();
        } else {
            if (speciality.equalsIgnoreCase("TransportDroid")) {
                return new TransportDroidFactory();
            } else {
                throw new RuntimeException(String.format("%d does not exists", speciality));
            }
        }
    }
}
