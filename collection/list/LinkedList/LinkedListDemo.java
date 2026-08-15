package collection.list.LinkedList;

import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 1. add(element) -> adds at the end
        list.add("Amit");
        list.add("Priya");
        list.add("Rahul");
        System.out.println("After add(): " + list);

      /*  // 2. add(index, element) -> insert at specific position
        list.add(1, "Sneha");
        System.out.println("After add(1, Sneha): " + list);

        // 3. addFirst(element) -> insert at the beginning
        list.addFirst("Vijay");
        System.out.println("After addFirst(): " + list);

        // 4. addLast(element) -> insert at the end (same as add)
        list.addLast("Karan");
        System.out.println("After addLast(): " + list);

        // 5. getFirst() -> returns first element
        System.out.println("getFirst(): " + list.getFirst());

        // 6. getLast() -> returns last element
        System.out.println("getLast(): " + list.getLast());

        // 7. get(index) -> returns element at given index
        System.out.println("get(2): " + list.get(2));

        // 8. set(index, element) -> replace element at index
        list.set(2, "Anita");
        System.out.println("After set(2, Anita): " + list);

        // 9. size() -> number of elements
        System.out.println("size(): " + list.size());

        // 10. contains(element) -> check if element exists
        System.out.println("contains(Rahul): " + list.contains("Rahul"));

        // 11. indexOf(element) -> first index of element
        System.out.println("indexOf(Rahul): " + list.indexOf("Rahul"));

        // 12. isEmpty() -> check if list is empty
        System.out.println("isEmpty(): " + list.isEmpty());

        // 13. removeFirst() -> removes and returns first element
        System.out.println("removeFirst(): " + list.removeFirst());
        System.out.println("After removeFirst(): " + list);

        // 14. removeLast() -> removes and returns last element
        System.out.println("removeLast(): " + list.removeLast());
        System.out.println("After removeLast(): " + list);

        // 15. remove(index) -> removes element at index
        list.remove(0);
        System.out.println("After remove(0): " + list);

        // 16. remove(Object) -> removes first occurrence of the object
        list.remove("Rahul");
        System.out.println("After remove(Rahul): " + list);

        // 17. peek() -> retrieves head without removing (returns null if empty)
        System.out.println("peek(): " + list.peek());

        // 18. peekFirst() / peekLast()
        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println("peekLast(): " + list.peekLast());

        // 19. poll() -> retrieves and removes head (returns null if empty)
        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);

        // 20. push(element) -> inserts at the beginning (Stack behaviour)
        list.push("Neha");
        System.out.println("After push(Neha): " + list);

        // 21. pop() -> removes and returns first element (Stack behaviour)
        System.out.println("pop(): " + list.pop());
        System.out.println("After pop(): " + list);

        // 22. offer(element) -> adds at the end (Queue behaviour)
        list.offer("Rohit");
        System.out.println("After offer(Rohit): " + list);

        // 23. offerFirst(element) / offerLast(element)
        list.offerFirst("Suresh");
        list.offerLast("Meena");
        System.out.println("After offerFirst/offerLast: " + list);

        // 24. iterator() -> traverse the list
        System.out.print("Traversal using Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 25. descendingIterator() -> traverse in reverse order
        System.out.print("Traversal using descendingIterator: ");
        Iterator<String> dit = list.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();

        // 26. toArray() -> convert list to array
        Object[] arr = list.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // 27. clone() -> shallow copy of the list
        LinkedList<String> cloned = (LinkedList<String>) list.clone();
        System.out.println("clone(): " + cloned);

        // 28. clear() -> removes all elements
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("isEmpty() after clear: " + list.isEmpty());
    */
   }
}