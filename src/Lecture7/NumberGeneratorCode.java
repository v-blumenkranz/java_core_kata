package Lecture7;

import java.util.function.Function;
import java.util.stream.Stream;

public class NumberGeneratorCode {

    @FunctionalInterface
    public interface NumberGenerator <T extends Number>{
        boolean cond(T arg);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return arg -> arg.intValue() > 0;
    }


}
