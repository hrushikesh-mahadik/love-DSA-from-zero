package collection.arrays;

import java.util.Scanner;

public class Array{
 public static void main(String[] args){
        System.out.println("hello");
        // Declearation
        int arr[];
        // Allocation 
        arr = new int[5];
        // Init
        int brr[] ={1,2,3,4};     
        System.out.println("value of 0 index "+ brr[0]);
        int n = brr.length;
        System.out.println(n);
        
        for(int index=0; index<=n-1; index++){
            System.out.println("Array index is  "+ brr[index]);
        }

        for(int a : brr){
            System.out.println(a);
        }

        Scanner sc = new Scanner(System.in);
        int length = arr.length;
        for(int i=0;i<=length-1;i++){
            System.out.println("Provide input for index "+i);
            arr[i]=sc.nextInt();
        }

        System.out.println("Your Array contains ");
         for(int b : arr){
            System.out.print(b + " ");
            }

            int sum =0;
        for(int i =0;i<=length-1;i++){
            int val = arr[i];
            sum +=val;
        }
        System.out.println("Sum of your Array "+sum);

        
    }
}