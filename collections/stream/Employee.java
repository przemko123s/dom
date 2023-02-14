package collections.stream;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int evaluation;
    private Position position;

    public Employee(String name, double salary, int evaluation, Position position) {
        this.name = name;
        this.salary = salary;
        this.evaluation = evaluation;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && evaluation == employee.evaluation && Objects.equals(name, employee.name) && position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, evaluation, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", evaluation=" + evaluation +
                ", position=" + position +
                '}';
    }


}
