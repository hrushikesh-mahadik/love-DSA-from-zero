package BasicProgram;

public class HCF {
    public static void main(String[] args) {
        int a=12,b=15;
        int hcf =1;

        for(int i =1;i<=a;i++){
            if(a%i==0&&b%i==0){
                hcf =i;
            }
        }
        System.out.println("HCF " +hcf);
    }
    
}
