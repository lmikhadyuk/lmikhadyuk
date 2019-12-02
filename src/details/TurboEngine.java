package details;

import airplanes.Plane;

public class TurboEngine extends Engine {
    public TurboEngine(int power) {
        super(power);
    }

    @Override
    public int showMaxSpeed() {
        return getPower()* 2;

    }

    @Override
    public int showMaxSpeed(int weight) {
        if (weight < Plane.getMinWeight() || weight > Plane.getMaxWeight()) {
            return 0;
        }

        return this.showMaxSpeed() * (1 - (weight / 100));
    }
}



