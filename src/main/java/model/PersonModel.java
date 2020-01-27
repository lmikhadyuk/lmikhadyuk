package model;

public class PersonModel {
    private String firstname;
    private String lastname;
    private PersonTypeModel type;

    public PersonModel() {
    }

    public PersonModel(String firstname, String lastname,PersonTypeModel type) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.type=type;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public PersonTypeModel getType() {
        return type;
    }

    public void setType(PersonTypeModel type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", type=" + type +
                '}';
    }
}
