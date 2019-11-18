package airlines;

import airplanes.Plane;

import java.util.List;

public class Airline {
    private String name;
    private List<Plane> planes;

    public Airline(String name, List<Plane> planes) {
        this.name = name;

        this.planes = planes;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", planes=" + planes +
                '}';
    }
}
