
import java.util.Scanner;

public class palindrome {
             public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int temp=N;
        int rem2=0;
        int rem1=0;
        while(N>0){
            rem1=N%10;
            rem2=rem2*10+rem1;
            N=N/10;
        }
        if(rem2==temp){
            System.out.print("Yes the number is Palindrome");

        }else{
            System.out.print("No the number is not a Palindrome");

        }
    }
}
