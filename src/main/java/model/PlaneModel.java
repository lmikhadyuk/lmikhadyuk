package model;

public class PlaneModel {
    private String name;
    private String model;
    private Integer year;
    private PlaneTypeModel type;

    public PlaneModel() {
    }

    public PlaneModel(String name, String model, Integer year, PlaneTypeModel type) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.type = type;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public PlaneTypeModel getType() {
        return type;
    }

    public void setType(PlaneTypeModel type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PlaneModel{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", type=" + type +
                '}';
    }
}

