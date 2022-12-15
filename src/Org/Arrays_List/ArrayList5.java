package Org.Arrays_List;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;

    }
}
public class ArrayList5 {
    public static void main(String[] args) {
        Student s1=new Student(101,"ravi",23);
        Student s2=new Student(11,"kant",22);
        ArrayList<Student>list =new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        //Getting iterater
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Student st=(Student) itr.next();
            System.out.println(st.rollno+""+st.name+""+ st.age);

        }
    }
}
