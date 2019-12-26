package airplanes;

import details.Engine;

public class FighterPlane extends Plane implements Capabilities {
    public FighterPlane(String name, String model, int year, Engine engine) {
        super(name, model, year, engine);
    }

    @Override
    public void speed() {
        System.out.println("200 km/hour");
    }

    @Override
    public String getInfoPlane() {
        return "name= " + getName() + ", model= " + getModel() + ", year= " + getYear();
    }
}
