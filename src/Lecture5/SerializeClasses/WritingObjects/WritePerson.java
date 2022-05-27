package Lecture5.SerializeClasses.WritingObjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritePerson {
    public static void main(String[] args) {
        Person person1 = new Person(234, "Лера");
        Person person2 = new Person(235, "Лёша");

        //Расширение может отсутствовать или быть любым, но по традиции файлы
        // с бинарными данными получают расширение bin.
        //Объект FileOutputStream занимается записью любых данных (графика, звук, объекты, символы) в виде байтов,
        //а объект ObjectOutputStream занимается только записью объектов.
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
