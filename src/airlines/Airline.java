package airlines;


import airplanes.Capabilities;

public class Airline {
    private String name;


    public Airline(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airline" +
                "name='" + name;
    }
}
