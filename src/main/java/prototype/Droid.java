package prototype;

public class Droid implements Copyable {
    private String name;
    private int health;
    private int armor;

    public Droid(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Object copy() {
        Droid copy = new Droid(name, health, armor);
        return copy;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", armor=" + armor +
                '}';
    }
}
