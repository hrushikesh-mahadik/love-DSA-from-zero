package collection.Queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    
    public static void main(String[] args) {
        
        Queue <Integer> v = new PriorityQueue<>();

        v.add(30);
        v.add(15);
        v.add(10);
        v.add(20);
        v.add(25);

       System.out.println(v);

       System.out.println(v.poll());
       System.out.println(v);

       


    }
}
