package Lecture5;

import java.io.*;

public class PrintStreams {

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int a = 0;
        while ((a = inputStream.read()) != -1) {
            if (a % 2 == 0) {
                outputStream.write(a);
            }
        }
        outputStream.flush();
        System.out.println(outputStream);
    }

    public static void main(String[] args) throws IOException {
        byte[] buf = {3, 10, 4, 5, 7};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);
        OutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);


    }


}
