package Lekcja8;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dog)){
            return false;
        }
        Dog dog = (Dog) obj;
        return dog.age==this.age && dog.name.equals(this.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
