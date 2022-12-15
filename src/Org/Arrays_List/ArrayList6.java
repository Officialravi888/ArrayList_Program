package Org.Arrays_List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList6 {
    public static void main(String[] args) {
       ArrayList<String>list=new ArrayList<>();
       list.add("ravi");
       list.add("raj");
       list.add("shiv");
        System.out.println("value:"+list);
        list.add("rahul");//---------------------------------------------------------
        System.out.println("add:"+list);
        ArrayList<String>a=new ArrayList<>();

        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        System.out.println("add:"+a);
        a.remove("d");//----------------------------------------------------------
        System.out.println("value:"+a);
        a.clear();//-------------------------------------------------------------------
        System.out.println("clear:"+a);
        a.add("Ravikant");
        list.add("raj");
        System.out.println("value:"+list+""+a);
    }
}
