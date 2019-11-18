package airplanes;

import person.Person;

import java.util.List;

public class CommercialPlane extends Plane {
    public CommercialPlane(String name, String model, int year, List<Person> crew) {
        super(name, model, year, crew);
    }
}
