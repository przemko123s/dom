package lekcja7;
import lekcja7.figure.Figure;
import lekcja7.figure.Square;

public class Main {
    public static void main(String[] args) {
        // Person person = new Person("Jan", "Kowalski");
        Employee employee = new Employee("Paweł", "Nowak", 3200, 20, 20);
        Student student = new Student("Adam", "Nowakowski", 1000, 1000);

        printIncome(employee);
        printIncome(student);
        Figure kwadrat = new Square("Kwadracik", 3);
        Square kwadrat2 = new Square("Kwadracik2", 4);
        printArea(kwadrat);
        printArea(kwadrat2);
        System.out.println(kwadrat2.getName());

    }

    private static void printIncome(Profitable profitable) {
        System.out.println(profitable.getTotalIncome());
    }

    private static void printArea(Figure figure){
        System.out.println(figure.getArea());
    }

}
