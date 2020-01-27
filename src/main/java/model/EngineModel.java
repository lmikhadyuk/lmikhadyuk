package model;

public class EngineModel {
    private Integer power;
    private EngineTypeModel type;

    public EngineModel() {
    }

    public EngineModel(Integer power, EngineTypeModel type) {
        this.power = power;
        this.type = type;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public EngineTypeModel getType() {
        return type;
    }

    public void setType(EngineTypeModel type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EngineModel{" +
                "power=" + power +
                ", type=" + type +
                '}';
    }
}
