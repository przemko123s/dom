package collections;

import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        final Animal kubisz = new Animal("Kubisz", 4);
        final Animal jackie = new Animal("Jackie", 0);
        final Animal loki = new Animal("Loki", 2);
//
//        HashSet<Animal> animals = new HashSet<>();
//        animals.add(kubisz);
//        animals.add(jackie);
//        animals.add(loki);
//        final boolean contains = animals.contains(kubisz);
//        System.out.println(animals);
//        kubisz.setAge(5);
//        final boolean contains1 = animals.contains(kubisz);
//        System.out.println(animals);
//        System.out.println(contains);
//        System.out.println(contains1);
//
//
//        System.out.println(animals);
//
//        final boolean contains2 = animals.contains(new Animal("Kubisz", 4));
//        System.out.println(contains2);
//        animals.remove(new Animal("Kubisz", 4));
//        System.out.println(animals);
//        animals.add(new Animal("Kubisz", 4));
//        animals.add(new Animal("Kubisz", 4));
//        System.out.println(animals);


        final Animal burek = new Animal("Burek", 2);
        final TreeSet<Animal> treeAnimals = new TreeSet<>();
        treeAnimals.add(kubisz);
        treeAnimals.add(jackie);
        treeAnimals.add(burek);
        treeAnimals.add(loki);
        System.out.println(burek.equals(loki));
        System.out.println(treeAnimals);

        System.out.println(treeAnimals.ceiling(new Animal("Loki", 2)));
        System.out.println(treeAnimals.higher(new Animal("Loki", 2)));
        System.out.println(treeAnimals.lower(new Animal("Loki", 2)));
        System.out.println(treeAnimals.floor(new Animal("Loki", 2)));

        System.out.println(treeAnimals);
        System.out.println(treeAnimals.pollFirst());
        System.out.println(treeAnimals);
        System.out.println(treeAnimals.first());
        System.out.println(treeAnimals);
        System.out.println(treeAnimals.pollLast());
        System.out.println(treeAnimals);
        System.out.println(treeAnimals.last());
        System.out.println(treeAnimals);





    }
}