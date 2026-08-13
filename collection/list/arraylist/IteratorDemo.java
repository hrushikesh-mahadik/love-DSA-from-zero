package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}
