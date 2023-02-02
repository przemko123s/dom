package Lekcja8;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Jan", "Nowak", "buziaczek@wp.pl");
   //     System.out.println(client);

        Car car = new Car("audi", "a8", client);
        client.setCar(car);

  //      System.out.println(car);

        Dog dog1 = new Dog("Kubisz", 4);
        Dog dog2 = new Dog("Jackie", 0);
        Dog dog3 = new Dog("Jackie", 0);
        Dog dog4 = dog2;

        System.out.println(dog2.equals(dog3));

    }
}
