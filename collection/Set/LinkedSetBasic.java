package collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetBasic {
    public static void main(String[] args) {
        Set <Integer> list = new LinkedHashSet<>();

        list.add(44);
        list.add(45);
        list.add(46);
        
        System.out.println(list);

          Set <Integer> list2 = new LinkedHashSet<>();
         list2.add(45);
        list2.add(46);
        list2.add(47);
   
        System.out.println(list);

        list.retainAll(list2);
        System.out.println(list);


        System.out.println(list2.containsAll(list));
    }
}
