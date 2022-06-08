package Lecture7;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxInStream {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        list.sort(order);
        if (list.size() == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }
    }
}


class TestMinMaxInStream{
    public static void main(String[] args) {
        Stream streamOfChars = Stream.of('c', 'b', 'd', 'e', 'a', 'g', 'f');
        IntStream streamOfNumbers = IntStream.of(7, 10, 3, 2, 4, 9);
        Comparator order = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        BiConsumer minMaxConsumer = new BiConsumer() {
            @Override
            public void accept(Object o, Object o2) {
                System.out.println(o + ", " + o2);
            }
        };

        MinMaxInStream.findMinMax(streamOfChars, order, minMaxConsumer);
    }
}
