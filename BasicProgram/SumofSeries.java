package BasicProgram;

public class SumofSeries{
    public static void m(int n){
        if(n==0){
                System.out.println("Enter vaild input");
        }
            
        
        int temp = n*(n+1);
        int res = temp/2;

   System.out.println(res);
  

    }

    public static void main(String[] args) {
        SumofSeries a = new SumofSeries();
        a.m(4);
    }
}