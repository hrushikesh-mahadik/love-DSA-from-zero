package collection.Set;

import java.util.HashSet;

public class StudentHashset {
    public static void main(String[] args) {
        HashSet <Student> set = new HashSet<>();

        Student s1 = new Student(1, "Vishu");
        Student s2 = new Student(2,"Rishi");


        set.add(s2);
        set.add(s1);
        System.out.println(set);
    }
}
