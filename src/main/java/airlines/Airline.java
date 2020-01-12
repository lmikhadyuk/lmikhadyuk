package airlines;


import airplanes.Plane;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;


public class Airline {
    private String name;
    private Set<Plane> planes = new HashSet<Plane>();
    private static final Logger LOGGER = Logger.getLogger(Airline.class);

    public void addPlane(Plane plane1) {
        LOGGER.debug("Info about plane:"+plane1.toString());
        planes.add(plane1);

    }

    public Set<Plane> getSetOfPlanes() {
        if (planes != null && !planes.isEmpty()) {

            return planes;
        } else {
            return null;
        }

    }


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
