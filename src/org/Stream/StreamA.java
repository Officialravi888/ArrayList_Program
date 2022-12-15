package org.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamA {
    public static void main(String[] args) {
        Random random=new Random();

//    List<String> A=  Arrays.asList("ravi","kant","raj","shiv");
//    // demonstration of map method
////    List<String> a = A.stream().map(x -> x).
////            collect(Collectors.toList());
//
//        int Randq =random.nextInt(A.size());
//        String rand1=A.get(Randq);
//        System.out.println(rand1);


        // create a list of String
//        List<String> names =
//                Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
//        List<String> result = names.stream().filter(s->s.startsWith("C")).
//                collect(Collectors.toList());
//        System.out.println(result);

//        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        List<Integer> number = Arrays.asList(2,3,4,5);

        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
}
}
