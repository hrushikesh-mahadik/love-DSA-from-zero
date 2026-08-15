package collection.list.Vector;
import java.lang.*;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector <String> v = new Vector<>();

        v.add("Vishu");
        v.add("saku");
        v.add("ritu");
        System.out.println(v);

        v.add(1,"rishi");
        System.out.println(v);

        Vector <String> r = new Vector<>();
          r.add("kattu");
        r.add("Bunty");
        r.add("Yogini");
        
        v.addAll(r);
        System.out.println(v);

       System.out.println( v.get(0));

       v.remove(2);
       System.out.println(v);

       v.removeAll(r);
       System.out.println(v);

       /* v.clear();
       System.out.println(v); */


    }
}
