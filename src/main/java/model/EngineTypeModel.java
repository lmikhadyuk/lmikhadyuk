package model;

public class EngineTypeModel {
    private String type;

    public EngineTypeModel(String type) {
        this.type = type;
    }

    public EngineTypeModel() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EngineTypeModel{" +
                "type='" + type + '\'' +
                '}';
    }
}
