package model;

public class PersonTypeModel {
    private String type;

    public PersonTypeModel() {
    }

    public PersonTypeModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PersonTypeModel{" +
                "type='" + type + '\'' +
                '}';
    }
}
