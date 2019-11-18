package airplanes;

import person.Person;

import java.util.List;

public class CharterPlane extends Plane {
    public CharterPlane(String name, String model, int year, List<Person> crew) {
        super(name, model, year,crew);
    }

}
