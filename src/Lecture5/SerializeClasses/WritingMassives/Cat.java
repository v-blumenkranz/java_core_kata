package Lecture5.SerializeClasses.WritingMassives;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
