package BasicProgram;

public class PrimeNo {
    public static void main(String[] args) {
      int  num = 4;
      boolean isPrime = true;

      if(num<=1){
        System.out.println("The Number is Not Prime");
      }

      for(int i=2; i<num ;i++){
        if(num%i==0){
            isPrime = false;
            break;
        }
      }
      System.out.println(num + " This Number is " + isPrime + " Prime");

    }
}
