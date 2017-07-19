package adapter;

public class Droid {
    private String name;
    private int weight;
    private int year;

    public Droid() {
    }

    public Droid(String name, int weight, int year) {
        this.name = name;
        this.weight = weight;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}
