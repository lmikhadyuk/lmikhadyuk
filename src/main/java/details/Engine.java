package details;

public abstract class Engine {
    private int power;
    public abstract int showMaxSpeed();
    public abstract int showMaxSpeed(int weight);

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
