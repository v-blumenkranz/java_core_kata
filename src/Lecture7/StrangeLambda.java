package Lecture7;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class StrangeLambda {
    private boolean condition;


    /*public <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) == true:ifTrue.apply(t):ifFalse;
    }*/

    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        //Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
    }
}