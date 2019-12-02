package airplanes;

import details.Engine;

public class Plane {
    private String name;
    private String model;
    private int year;
    private Engine engine;
    private static final int MIN_WEIGHT = 0;
    private static final int MAX_WEIGHT = 90;
    private final String voice;

    public Plane(String name, String model, int year, Engine engine) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.voice = "Vroom-vroom";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        switch (year) {
            case 2018:
                System.out.println("Third-series Plane");
                break;
            case 2017:
                System.out.println("Second-series Plane");
                break;
            case 2016:
                System.out.println("First-series Plane");
                break;
            default:
                System.out.println("No plane was manufactured this year");
                break;


        }
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static int getMinWeight() {
        return MIN_WEIGHT;
    }

    public static int getMaxWeight() {
        return MAX_WEIGHT;
    }

    public final String getVoice() {
        return voice;
    }



    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
