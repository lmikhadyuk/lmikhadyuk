import airlines.Airline;
import airplanes.Capabilities;
import airplanes.CharterPlane;
import airplanes.FighterPlane;
import airplanes.Plane;
import details.Engine;
import details.ReactiveEngine;
import details.TurboEngine;
import exceptions.CrewIsEmptyException;
import person.Person;
import person.Pilot;
import person.Stewardess;


public class Executor {

    public static void main(String[] args) {
        Pilot pilot1 = new Pilot("Ivan", "Ivanov", "1");
        Pilot pilot2 = new Pilot("Vova", "Ivanov", "3");
        Pilot pilot3 = new Pilot("Nikita", "Sidorevich", "1");
        Stewardess stewardess1 = new Stewardess("Liza", "MI", "business");
        Person person1 = new Person("Liza", "Mikhadyuk");
        Person person2 = new Person("Inna", "Matskevich");
        Engine engine1 = new TurboEngine(3000);
        Engine engine2 = new ReactiveEngine(5000);

        CharterPlane charterPlane1 = new CharterPlane("SukhoiSuperjet", "100", 2018, "Shattl", engine1);
        FighterPlane fighterPlane1 = new FighterPlane("Il-26", "200", 2019, engine2);
        Capabilities charterPlane2 = new CharterPlane("SukhoiSuperjet", "100", 2018, "Shattl", engine1);
        Capabilities fighterPlane2 = new FighterPlane("Il-26", "200", 2019, engine2);
        charterPlane1.speed();
        fighterPlane1.speed();
        System.out.println(charterPlane1.getInfoPlane());
        System.out.println(fighterPlane1.getInfoPlane());

        Airline airline1 = new Airline("Belavia");

        System.out.println(pilot1.toString());
        System.out.println("Pilot first name:" + pilot1.getFirstName());
        System.out.println(stewardess1.toString());
        System.out.println(charterPlane1.toString());
        System.out.println("Max Speed for Charter= " + charterPlane1.getEngine().showMaxSpeed());
        System.out.println("Max Speed for Fighter= " + fighterPlane1.getEngine().showMaxSpeed());
        System.out.println("Max Speed for Charter with cargo= " + charterPlane1.getEngine().showMaxSpeed(3000));
        System.out.println("Max Speed for Fighter with cargo= " + fighterPlane1.getEngine().showMaxSpeed(50));
        System.out.println("Voice for charter plane= " + charterPlane1.getVoice());


        System.out.println(airline1.toString());

        charterPlane1.addPerson(pilot1);
        charterPlane1.addPerson(stewardess1);
        charterPlane1.addPerson(pilot2);

        try {
            for (Person person : charterPlane1.getListOfPersons()) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        } catch (CrewIsEmptyException e) {
            System.out.println("No crew");
        }

        airline1.addPlane(charterPlane1);
        airline1.addPlane(fighterPlane1);

        for (Plane x : airline1.getSetOfPlanes()) {
            System.out.println(x.getName() + " " + x.getModel() + " " + x.getEngine().showMaxSpeed());
        }
        charterPlane1.addPerson(1, person1);
        charterPlane1.addPerson(2, person2);


        System.out.println(charterPlane1.getMapOfPersons().get(1).toString());
        System.out.println(charterPlane1.getMapOfPersons().get(2).toString());

    }
}
