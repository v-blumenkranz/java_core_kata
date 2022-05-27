package Lecture5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class ConvertBytesToString {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        Writer writer = new StringWriter();
        int b = 0;
        while ((b = reader.read()) != -1) {
            writer.append((char) b);
        }
        return writer.toString();
    }


    public static void main(String[] args) throws IOException{
        Charset charset = StandardCharsets.UTF_8;
        byte [] buf = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(buf);
        System.out.println(readAsString(inputStream, charset));

    }
}
