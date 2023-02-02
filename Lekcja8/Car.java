package Lekcja8;

public class Car {
    private String brand;
    private String model;
    private Client client;


    public Car(String brand, String model, Client client) {
        this.brand = brand;
        this.model = model;
        this.client = client;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", client=" + client.getMail() +
                '}';
    }
}
