package Org.Arrays_List;

import java.util.ArrayList;

//Iterating ArrayList using For-eachloop---------------------------------------
public class ArrayD {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("rajeshh");
        list.add("harsh");
        list.add("rahul");
        list.add("shiv");
        for(String A:list)
            System.out.println(A);
    }
}
