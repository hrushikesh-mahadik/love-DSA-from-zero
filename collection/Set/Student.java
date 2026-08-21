package collection.Set;

import java.util.Objects;

public class Student {
   public int roll;
   public String name;

     public Student(int roll, String name){
      this.roll=roll;
      this.name=name;
    }

    @Override

    public String toString(){
        return "Student{" +
                    "roll=" + roll +
                    ", name='" + name + '\'' +
                    '}';
    }
@Override
public boolean equals(Object v){
    if(this==v) return true;
    if(v==null || getClass() != v.getClass()) return false;
    Student student = (Student) v;
    return roll == student.roll;
}

@Override
public int hashCode(){
    return Objects.hash(roll);
}

    
}
