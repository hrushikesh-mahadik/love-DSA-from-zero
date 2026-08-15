package collection.list.Vector.Stack;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack <Integer> v = new Stack<>();

        v.add(2);
        v.add(4);
        v.add(6);
        v.add(8);
        v.add(1);
        v.add(0);
        System.out.println(v);

        Collections.sort(v);
        System.out.println("After the Sorted the Stack " +v);

        v.push(30);
        System.out.println(v);
        
        v.pop();
        System.out.println(v);

      
        System.out.println(  v.peek());
        
        System.out.println(v);

        System.out.println(v.search(8));

        System.out.println(v.empty());

             
    }
}
