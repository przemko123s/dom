package collections.stream;

import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = List.of("Marcin", "Adam", "Kasia");

        names.forEach(new MyConsumer());

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " + s);
            }
        });
        names.forEach(s -> System.out.println("Hello " + s));
        //obie metody robia to samo







        System.out.println(modify("Alek", new StringModifier() {
            @Override
            public String modify(String s) {
                return s + "!";
            }
        }));

        System.out.println(modify("Alek", name -> name + "!!"));
        //return name+"!!"

        System.out.println(modify("Alek", name -> {
            System.out.println(name);
            return name + "!!!";
        }));
    }

    public static String modify(String s, StringModifier modifier) {
        return modifier.modify(s);
    }


}
