package airplanes;


import details.Engine;

public class CharterPlane extends Plane implements Capabilities {
    private String type;

    public CharterPlane(String name, String model, int year , String type, Engine engine) {
        super(name, model, year, engine);
        this.type = type;
    }

    @Override
    public String toString() {
        return "CharterPlane( "+  "name='" + getName() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() + ", " +
                "type='" + type + '\'' +
                ')';
    }

    @Override
    public void speed() {
        System.out.println("1000 km/hour");

    }

    @Override
    public String getInfoPlane() {
        return "model= " + getModel() + ", year= " + getYear() ;
    }
}
