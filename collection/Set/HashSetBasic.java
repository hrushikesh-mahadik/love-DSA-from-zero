package collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasic {
    public static void main(String[] args) {
        Set<Integer> v = new HashSet<>();

        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(30);
        System.out.println(v);

        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);


        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        

        System.out.println(set2.containsAll(set1));
    }
}
