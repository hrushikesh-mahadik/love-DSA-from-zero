package BasicProgram;

public class LCM {
    public static void main(String[] args) {
         int a=12,b=15;
        int lcm =1;

        for(int i =1;i<=a*b;i++){
            if(i%a==0&&i%b==0){
System.out.println("LCM " +i);
break;
            }
        }
        
    }
    
}
