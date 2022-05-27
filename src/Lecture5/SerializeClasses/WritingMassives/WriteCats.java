package Lecture5.SerializeClasses.WritingMassives;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteCats {
    public static void main(String[] args) throws FileNotFoundException {
        Cat [] cats = {new Cat("Леша", 30), new Cat("Лера", 24),
                new Cat("Ириска", 2)};

        try {
            FileOutputStream fos = new FileOutputStream("cats.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(cats.length);

            for (Cat cat : cats) {
                oos.writeObject(cat);
            }
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
