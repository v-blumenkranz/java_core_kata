package Lecture5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GetSymbolBytes {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream("1".getBytes());
        int b = 0;
        while ((b = inputStream.read()) != -1) {
            System.out.println(b + " ");
        }
    }
}
