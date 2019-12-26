package person;

public class Pilot extends Person {
    private String rank;

    public Pilot(String firstName, String lastName, String rank) {
        super(firstName, lastName);
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Pilot" +
                "(rank)='" + rank + '\'';
    }
}
