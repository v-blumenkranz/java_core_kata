package Lecture6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sales {
    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> returnedMap = new HashMap<>();
        Scanner scan = new Scanner(reader);
        String key;
        Long value;
        while (scan.hasNext()) {
            returnedMap.merge(key = scan.next(), value = scan.nextLong(), Long::sum);
        }
        return returnedMap;
    }

}

class TestSales {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.println(Sales.getSalesMap(buffReader));
    }
}
