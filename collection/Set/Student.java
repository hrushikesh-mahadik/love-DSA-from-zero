package collection.Set;

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
    
}
