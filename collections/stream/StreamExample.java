package collections.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        final List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alek", 3500,
                9, Position.DEVELOPER));
        employees.add(new Employee("Tomek", 4000,
                6, Position.DEVELOPER));
        employees.add(new Employee("Paweł", 2500,
                7, Position.MANAGER));
        employees.add(new Employee("Agata", 8500,
                10, Position.TECH_LEAD));
        employees.add(new Employee("Marcin", 2000,
                8, Position.RECRUITER));

        final List<String> over3800Names = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPosition() == Position.TECH_LEAD
                    || employee.getPosition() == Position.DEVELOPER) {
                if (employee.getSalary() > 3800) {
                    over3800Names.add(employee.getName());
                }
            }
        }
        System.out.println(over3800Names);


        // final Stream<Employee> stream = employees.stream();

        List<String> names = employees
                .stream()
                .filter(employee -> employee.getSalary() > 3800)
                // .limit(1) - ogranicza strumien do 1 elementu
                .peek(employee -> System.out.println("Filtered employee > 3800: " + employee))
                .filter(employee -> employee.getPosition().isIt())
                .map(employee -> employee.getName())
                .peek(s -> System.out.println("Mapped employee name: " + s))
                .collect(Collectors.toList());

        //not in IT && Evaluation>5
        List<Employee> names2 = employees
                .stream()
                .filter(employee -> employee.getEvaluation() > 5)
                .filter(employee -> !employee.getPosition().isIt())
                .peek(s -> System.out.println("Mapped employee name: " + s))
                .collect(Collectors.toList());


        List<Double> salaries = employees
                .stream()
                .filter(employee -> employee.getEvaluation() > 5)
                .filter(employee -> !employee.getPosition().isIt())
                .map(Employee::getSalary)
                .peek(s -> System.out.println("Mapped employee name: " + s))
                .collect(Collectors.toList());

        System.out.println();
        //System.out.println(names);
        //System.out.println(names2);
        System.out.println(salaries);


        Optional<Double> reduceOptional = salaries
                .stream()
                //.reduce((d1, d2) -> d1 + d2);
                .reduce(Double::sum);

        Double totalSalary = reduceOptional.orElse(0d);
        Double totalSalaryNotNull = reduceOptional.orElseThrow(() -> new NullPointerException());
        System.out.println(totalSalary);


        final Double maxSalary = salaries
                .stream()
                .max((o1, o2) -> (int) (o1 - o2))
                .orElse(0d);
        System.out.println(maxSalary);

        long count = employees
                .stream()
                .filter(employee -> employee.getPosition() == Position.DEVELOPER)
                .count();
        System.out.println(count);

        employees
                .stream()
                //.max((o1, o2 -> Double.compare(o1.getSalary(), o2.getSalary()))
                .max(Comparator.comparingDouble(Employee::getSalary))
                .get();
        System.out.println(employees);

        String[] strings = {"xd", "lol"};
        final Stream<String> stringStream = Stream.of(strings);
        final String[] filteredStrings = Arrays
                .stream(strings)
                .filter(s -> s.length() > 2)
                .toArray(String[]::new);
        for (String s : filteredStrings
        ) {
            System.out.println(s);

        }
    }

}
