package airplanes;

import details.Engine;

public class Plane {
    protected String name;
    protected String model;
    protected int year;
    protected Engine engine;

    public Plane(String name, String model, int year, Engine engine) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
