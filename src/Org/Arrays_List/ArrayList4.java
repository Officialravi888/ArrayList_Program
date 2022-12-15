package Org.Arrays_List;

import java.util.*;


public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ravi");
        list.add("kant");
        //List<Object> list1 = Arrays.asList();
        System.out.println("Traversing list throught List iterator");
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);}
//        }
//
//        System.out.println("Traversing list");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }
//        System.out.println("traversing");
//        list.forEach(a->{System.out.println(a);});
//        System.out.println("traversing");
//        Iterator<String> itr=list.iterator();
//        itr.forEachRemaining(a->{System.out.println(a);});
        }
    }

