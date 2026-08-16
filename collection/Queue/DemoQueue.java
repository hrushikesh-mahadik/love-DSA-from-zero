package collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue <String> v = new LinkedList<>();

        v.offer("vishu");
        v.offer("akki");
        v.offer("rishi");
        v.offer("nutan");
        v.offer("dev");
        v.offer("aadi");
        System.out.println(v);

        v.poll();
        System.out.println(v);

        System.out.println(v.peek());
        
    }
}
