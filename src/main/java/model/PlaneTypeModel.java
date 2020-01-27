package model;

public class PlaneTypeModel {
    private String type;

    public PlaneTypeModel(String type) {
        this.type = type;
    }

    public PlaneTypeModel() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PlaneTypeModel{" +
                "type='" + type + '\'' +
                '}';
    }
}
