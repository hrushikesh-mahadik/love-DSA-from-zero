package collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DemoQueue01 {
    public static void main(String[] args) {
        Deque <String> v = new ArrayDeque<>();
        
        v.offer("rishi");   
        v.offer("vishu");
        v.offer("akki");
        v.offer("nutan");
        v.offer("dev");
        v.offer("aadi");
        v.offerLast("hitu");
        v.offerFirst("Raj");
        System.out.println(v);

        v.poll();
        System.out.println(v);

        System.out.println(v.peekLast());
        
        System.out.println(v.peekFirst());

        System.out.println(v.size());
    }
}
