package BasicProgram;

public class Palindrome {

    public static void main(String[] args) {
        int a =121;
        int orginal = a;
        int reverse =0;

        while(a>0){
            int digit = a%10;
            reverse =reverse*10+digit;
            a/=10;
        }
        if(orginal==reverse){
            System.out.println("it is Palindrome");
        }
    }
}
