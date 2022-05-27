package Lecture6;

import java.util.Optional;

public class Box <T> {
    private T object;

    public static <T> Box <T> getBox () {
        return new Box<>();
    }
}
