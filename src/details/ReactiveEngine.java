package details;

public class ReactiveEngine extends Engine {

    public ReactiveEngine(int power) {
        super(power);
    }

    @Override
    public int showMaxSpeed() {
        return getPower()* 3;
    }
}
