package Lekcja8;

public class Client {
    private String name;
    private String surname;
    private String mail;
    private Car car;

    public Client(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
