package details;

public class TurboEngine extends Engine {
    public TurboEngine(int power) {
        super(power);
    }

    @Override
    public int showMaxSpeed() {
        return getPower()* 2;
    }
}
