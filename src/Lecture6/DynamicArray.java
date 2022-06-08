package Lecture6;

import java.util.Arrays;
import java.util.Optional;

public class DynamicArray <T> {

    private Object [] changingArray = (T[])new Object[10];
    private int size = 0;

    public void add(T el) {
        if (size >= changingArray.length) {
            changingArray = Arrays.copyOf(changingArray, changingArray.length * 2);
        }
        changingArray[size++] = el;
    }

    public void remove(int index) {
        if ((index < size) & (index >= 0)) {
            System.arraycopy(changingArray, index + 1, changingArray, index, size - index -1);
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
        someArray.add("I'll try again");
        someArray.add("Otherwise");
        someArray.add("this");
        someArray.add("would");
        someArray.add("be");
        someArray.add("sad");
        someArray.add(":(");
        System.out.println(someArray.get(7));
        someArray.remove(7);
        System.out.println(someArray.get(7));


        DynamicArray<Integer> someOtherArray = new DynamicArray<>();
        someOtherArray.add(7);
        someOtherArray.add(315);
        someOtherArray.add(200);
    }
}
