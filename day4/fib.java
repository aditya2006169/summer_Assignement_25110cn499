
import java.util.Scanner;

public class fib {
         public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the N:");
        int N=in.nextInt();
        int fib1=0;
        System.out.println(0);
        int fib2=1;
        System.out.println(1);     
        for(int n=0;n<N;n++){
            int fib3=fib2+fib1;
            System.out.println(fib3);
            int temp=fib1;
            fib1=fib2;
            fib2=fib3;
        }
    }
}