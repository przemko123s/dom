package lekcja7;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullname() {
        return name + " " + surname;
    }

}
