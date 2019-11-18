import airlines.Airline;
import airplanes.CharterPlane;
import airplanes.Plane;
import person.Person;
import person.Pilot;
import person.Stewardess;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pilot pilot1 = new Pilot("Ivan", "Ivanov", "1");
        Stewardess stewardess1 = new Stewardess("Liza", "MI", "business");
        List<Person> crew = new ArrayList<>();
        crew.add(pilot1);
        crew.add(stewardess1);
        CharterPlane charterPlane1 = new CharterPlane("SukhoiSuperjet", "100", 2018, crew);
        List<Plane> planes = new ArrayList<>();
        planes.add(charterPlane1);
        Airline airline1 = new Airline("Belavia", planes);

        System.out.println(pilot1.toString());
        System.out.println(stewardess1.toString());
        System.out.println(charterPlane1.toString());
        System.out.println(airline1.toString());
    }
}
