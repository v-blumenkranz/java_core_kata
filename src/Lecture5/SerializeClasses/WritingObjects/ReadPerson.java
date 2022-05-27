package Lecture5.SerializeClasses.WritingObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPerson {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //По умолчанию метод readObject() возвращает объект класса Object.
            //Для того, чтобы вернуть нужный нам объект, необходимо сделать downcasting.
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            ois.close();
            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
