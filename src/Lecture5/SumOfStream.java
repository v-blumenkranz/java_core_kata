package Lecture5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SumOfStream {

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int a = 0;
        while ((a = inputStream.read()) != -1) {
            sum += (byte) a;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        byte [] buf = {1, 2, 4, 10};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);
        System.out.println(sumOfStream(inputStream));
    }
}
