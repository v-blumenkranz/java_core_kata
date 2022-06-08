package Lecture7.Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("my");
        arrayList.add("arrayList");
        arrayList.add("is");
        arrayList.add("the");
        arrayList.add("best");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
