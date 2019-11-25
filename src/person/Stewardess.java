package person;

public class Stewardess extends Person {
    private String businessClass;

    public Stewardess(String firstName, String lastName, String businessClass) {
        super(firstName, lastName);
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Stewardess" +
                "(businessClass)='" + businessClass + '\'';
    }
}
