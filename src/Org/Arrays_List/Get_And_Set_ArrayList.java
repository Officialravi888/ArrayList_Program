package Org.Arrays_List;

import javax.print.attribute.standard.MediaSizeName;
import java.util.ArrayList;

import static javax.print.attribute.standard.MediaSize.Engineering.A;

public class Get_And_Set_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("ravi");
        list.add("kant");
        list.add("shiv");
        list.add("raj");
        System.out.println("Returning element:"+list.get(1));
        list.set(1,"rahul");
        for (String A:list);
        System.out.println(A);
    }
}
