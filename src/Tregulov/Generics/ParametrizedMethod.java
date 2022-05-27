package Tregulov.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(20);
        arrayList1.add(3);
        arrayList1.add(18);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);
    }

}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}