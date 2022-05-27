package Lecture5.SerializeClasses.WritingMassives;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadCats {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("cats.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int lngth = ois.readInt();
            Cat [] cats = new Cat[lngth];

            for (int i = 0; i < lngth; i++) {
                try {
                    cats[i] = (Cat) ois.readObject();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            for (Cat cat : cats) {
                System.out.println(cat.toString());
            }

            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
