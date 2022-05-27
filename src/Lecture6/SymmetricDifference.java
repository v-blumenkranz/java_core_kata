package Lecture6;

import java.util.*;

public class SymmetricDifference {


    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet <T> commonElements = new HashSet<T>(set1);
        commonElements.retainAll(set2);
        HashSet <T> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        symmetricDifference.removeAll(commonElements);
        return symmetricDifference;
    }
}

class TestSymmetricDifference {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<String>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        HashSet<String> otherStrings = new HashSet<String>();
        otherStrings.add("a");
        otherStrings.add("b");
        otherStrings.add("c");
        otherStrings.add("g");
        otherStrings.add("s");

        System.out.println(SymmetricDifference.symmetricDifference(strings, otherStrings));


    }
}
