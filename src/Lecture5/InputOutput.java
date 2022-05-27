package Lecture5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputOutput {
    public static void main(String[] args) {

        int b = 0;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Hello.txt");
            while ((b = fis.read()) != -1)
            fis.read();
            System.out.println((char) b);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
