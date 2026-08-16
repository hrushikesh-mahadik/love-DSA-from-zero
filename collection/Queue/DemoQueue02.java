package collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DemoQueue02 {
    
    public static void main(String[] args) {
        
        Deque <Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());
        
        System.out.println(stack.size());


    }
}
