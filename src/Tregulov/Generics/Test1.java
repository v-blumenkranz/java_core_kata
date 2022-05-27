package Tregulov.Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(new StringBuilder("StringBuilder"));
        list.add(89);

        for (Object element : list) {
            System.out.println(element.toString() + ((String) element).length());
        }
    }

}
