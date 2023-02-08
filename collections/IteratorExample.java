package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorExample {
    public static void main(String[] args) {

        final Collection<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        System.out.println("Petla for ");
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println("\n\nStream forEach: ");
        strings.stream().forEach(s -> System.out.println(s));
        //strings.forEach(s -> System.out.println(s));
        //strings.forEach(System.out::println);

        System.out.println("\n\nIterator: ");
        final Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        System.out.println(ints);

        final Integer integer1= ints
                .stream()
                .filter(integer -> integer % 2 == 0)
                .max(Integer::compare)
                        .get();
        System.out.println(integer1);
    }
}
