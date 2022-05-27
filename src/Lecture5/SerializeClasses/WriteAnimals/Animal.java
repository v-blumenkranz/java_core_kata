package Lecture5.SerializeClasses.WriteAnimals;

import java.io.*;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal [] animals;
        try (ObjectInputStream oos = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = oos.readInt();
            animals = new Animal[size];
            for (int i = 0; i < size; i++) {
                animals[i] = (Animal) oos.readObject();
            }

        } catch (IOException e) {
            throw new IllegalArgumentException();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException();
        }
        return animals;
    }

}
