package airplanes;

import person.Person;

import java.util.List;

public class FighterPlane extends Plane {
    public FighterPlane(String name, String model, int year, List<Person> crew) {
        super(name, model, year, crew);
    }
}
