package Lecture6;

import java.util.ArrayList;

public class MethodWithParameter {

    public static <T> T getSecondElement (ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Неужели");
        strings.add("все");
        strings.add("так");
        strings.add("легко??");

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(114);
        integers.add(0);
        integers.add(200);
        integers.add(800);

        System.out.println(MethodWithParameter.getSecondElement(strings));
        System.out.println(MethodWithParameter.getSecondElement(integers));
    }
}
