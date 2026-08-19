package BasicProgram;

public class Fibonacci {
    public static void main(String[] args) {
        int n =10;
        int a=0,b=1;

        for(int i =1;i<=n;i++){
            System.out.println(a + " ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
    
}
