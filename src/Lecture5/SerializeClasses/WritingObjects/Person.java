package Lecture5.SerializeClasses.WritingObjects;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    Person (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
