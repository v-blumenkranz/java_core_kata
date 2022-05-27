package Lecture6;

import java.util.Arrays;
import java.util.Optional;

public class DynamicArray <T> {

    private Object [] changingArray = (T[])new Object[10];
    private int size = 0;

    public DynamicArray() {

    }

    public void add(T el) {
        if (size >= changingArray.length) {
            changingArray = Arrays.copyOf(changingArray, changingArray.length * 10);
        }
        changingArray[size] = el;
        size++;
    }

    public void remove(int index) {
        if ((index < size) & (index >= 0)) {
            for (int i = index + 1; i < changingArray.length; i++) {
                changingArray [i - 1] = (T) changingArray[i];
            }
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public T get(int index) {
        if ((index < size) & (index >= 0)) {
            return (T) changingArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}

class TestDynamicArray{
    public static void main(String[] args) {
        DynamicArray<String> someArray = new DynamicArray<>();
        someArray.add("Hello");
        someArray.add("!");
        someArray.add("I");
        someArray.add("hope");
        someArray.add("it");
        someArray.add("works");
        someArray.add(".");
        someArray.add("Otherwise");
        someArray.add("this");
        someArray.add("would");
        someArray.add("be");
        someArray.add("sad");
        someArray.add(":(");
        System.out.println(someArray.get(12));
        System.out.println(someArray.get(1));
        someArray.remove(1);
        System.out.println(someArray.get(1));
        System.out.println(someArray.get(12));
        System.out.println(someArray.get(11));
        System.out.println(someArray.get(250));

        DynamicArray<Integer> someOtherArray = new DynamicArray<>();
        someOtherArray.add(7);
        someOtherArray.add(315);
        someOtherArray.add(200);
    }
}
