package Lecture7;

import java.util.stream.IntStream;

public class PseudoRandomStream {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000);
    }


    public static void main(String[] args) {
        pseudoRandomStream(13);
    }
}


