package day5;

import java.util.Scanner;

public class strongnum {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = in.nextInt();
        int original=N;
        int temp=N;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            temp=temp/10;
            int fact=1;                
            for(int n=1;n<=rem;n++){
                fact=fact*n;
            }
            sum=sum+fact;        
        }
        if(sum==original){
            System.out.println("the number is strong number");
        }else{
            System.out.println("the number is not a strong number");
        }

    }
}        
