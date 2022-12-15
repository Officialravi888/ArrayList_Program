package Org.Arrays_List;
import java.util.ArrayList;
import java.util.Iterator;
//Iterating ArrayList using Iterator-----------------------------------------
public class ArrayC {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("ravi");
        list.add("raj");
        list.add("shiv");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
