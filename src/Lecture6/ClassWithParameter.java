package Lecture6;

public class ClassWithParameter <T> {
    private T value;

    ClassWithParameter (T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(((" + value + ")))";
    }

    public static void main(String[] args) {
        ClassWithParameter <String> info = new ClassWithParameter<>("Hello!!!");
        System.out.println(info);

        ClassWithParameter <Integer> someOtherInfo = new ClassWithParameter<>(300);
        System.out.println(someOtherInfo);
    }
}
