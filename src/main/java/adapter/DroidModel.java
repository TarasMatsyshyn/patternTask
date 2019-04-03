package adapter;

public class DroidModel {
    private String type;
    private int id;
    private int year;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DroidModel{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", year=" + year +
                '}';
    }
}
