package lekcja7;

public class Employee extends Person implements Profitable{
    private double salary;
    private double overTime;
    private double rate;


    public Employee(String name, String surname) {
        super(name, surname);
    }

    public Employee(String name, String surname, double salary, double overTime, double rate) {
        super(name, surname);
        this.salary = salary;
        this.overTime = overTime;
        this.rate = rate;
    }

    public double getTotalIncome() {
        return salary + (overTime * rate);
    }

}
