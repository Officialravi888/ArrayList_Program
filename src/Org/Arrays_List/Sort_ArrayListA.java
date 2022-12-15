package Org.Arrays_List;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayListA {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("ravi");
        list.add("raj");
        list.add("ravi");
        list.add("shiv");
        Collections.sort(list);
        for (String A : list)
            System.out.println(A);
        System.out.println("Sorting....................");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(34);
        Collections.sort(list2);
        for (Integer number:list2)
            System.out.println(number);
    }
}
