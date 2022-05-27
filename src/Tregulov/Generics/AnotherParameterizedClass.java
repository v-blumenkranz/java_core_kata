package Tregulov.Generics;

public class AnotherParameterizedClass <V1, V2> {
    private V1 value1;
    private V2 value2;

    public AnotherParameterizedClass(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class TestParameterizedClass{
    public static void main(String[] args) {
        AnotherParameterizedClass<String, Integer> something = new AnotherParameterizedClass<>("some String", 20);
        System.out.println(something.getValue1());
        System.out.println(something.getValue2());

        AnotherParameterizedClass<Double, Integer> otherThing = new AnotherParameterizedClass<>(7.7, 20);
        System.out.println(otherThing.getValue1());
        System.out.println(otherThing.getValue2());
    }
}