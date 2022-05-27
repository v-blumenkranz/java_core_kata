package Lecture6;

import java.util.Objects;

public class Pair <T, N> {

    private T value1;
    private N value2;


    private Pair (T value1, N value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst() {
        return value1;
    }

    public N getSecond() {
        return value2;
    }

    public static <T, N> Pair <T, N> of(T value1, N value2) {
        Pair<T, N> newPair = new Pair<T, N>(value1, value2);
        return newPair;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>) obj;
        return Objects.equals(p.value1, value1) && Objects.equals(p.value2, value2);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value1) + Objects.hashCode(value2);
    }
}

class TestPair {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(i);
        System.out.println(s);
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);


    }
}
