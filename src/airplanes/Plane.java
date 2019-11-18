package airplanes;

import person.Person;

import java.util.List;

public class Plane {
    private String name;
    private String model;
    private int year;
    private List<Person> crew;

    public Plane(String name, String model, int year, List<Person> crew) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.crew = crew;
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

    public List<Person> getCrew() {
        return crew;
    }

    public void setCrew(List<Person> crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", crew=" + crew +
                '}';
    }
}
