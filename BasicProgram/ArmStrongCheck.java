package BasicProgram;
// it equal the sum it own digit when each digit is cude equal
 
public class ArmStrongCheck {
    public static void main(String[] args) {
        int num =153;
        int sum =0;
        int orginal = num;
        
        while(num>0){
            int digit = num % 10;
            sum += digit*digit*digit;
            num /= 10;
        }
        System.out.println("Sum is " + sum);
       
        System.out.println("Is Armstrong " + (sum == orginal));
    }
}
