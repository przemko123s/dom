package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal kubisz = new Animal("Kubisz", 3);
        Animal jackie = new Animal("Jackie", 0);
        Animal loki = new Animal("Loki", 2);

        List<Animal> animals = new ArrayList<>();
        animals.add(kubisz);
        animals.add(jackie);
        animals.add(loki);

        System.out.println(animals);

        animals.add(0, loki);

        System.out.println(animals);

        animals.remove(new Animal("Loki", 2));

        System.out.println(animals);
        System.out.println(animals.size());
        final Animal animal = animals.get(0);
        System.out.println(animal);
        animals.removeAll(List.of(kubisz, jackie));
        System.out.println(animals);

        animals.add(kubisz);
        animals.add(jackie);

        System.out.println(animals);

        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
              //  return Integer.compare((o1.getAge(), o2.getAge())));
                return 0;
            }
        });
        System.out.println(animals);



    }
}
