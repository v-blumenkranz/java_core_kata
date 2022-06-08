package Lecture7;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequentWordsParser {

}

class FrequentWordsParserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
                .useDelimiter("[^А-Яа-яA-Za-z\\d]+");
        Stream stream = scanner.tokens()
                .map(word -> word.toLowerCase())
                .collect(Collectors.toMap(key -> key, value -> 1, Integer::sum)).entrySet().stream()
                .sorted((o1, o2) -> {
                    if (o1.getValue() == o2.getValue()) {
                        return o1.getKey().compareTo(o2.getKey());
                    } else if (o1.getValue() > o2.getValue()) {
                        return -1;
                    } else {
                        return 1;
                    }
                })
                .map(word -> word.getKey())
                .limit(10);
        stream.forEach(word -> System.out.println(word));

    }


}
