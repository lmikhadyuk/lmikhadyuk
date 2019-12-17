package airplanes;

import details.Engine;
import exceptions.CrewIsEmptyException;
import person.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Plane {
    private String name;
    private String model;
    private int year;
    private Engine engine;
    public static final int MIN_WEIGHT = 0;
    public static final int MAX_WEIGHT = 90;
    public final String voice;
    private List<Person> crew = new ArrayList<Person>();
    private Map<Integer,Person> sites = new HashMap<>();

    public void addPerson(Person person1) {
        crew.add(person1);
    }

    public List<Person> getListOfPersons() throws CrewIsEmptyException {
        if (crew != null && !crew.isEmpty()) {

            return crew;
        }
        throw new CrewIsEmptyException();
    }

    public void addPerson(Integer seat,Person person1){
        sites.put(seat, person1);

    }
    public Map<Integer,Person> getMapOfPersons() {
        if ( sites!= null && !sites.isEmpty()) {

            return sites;
        } else {
            return null;
        }
    }

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
