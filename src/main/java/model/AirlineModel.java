package model;

public class AirlineModel {
    private String name;

    public AirlineModel() {
    }

    public AirlineModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AirlineModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
