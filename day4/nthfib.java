import java.util.Scanner;

public class nthfib {
             public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the N:");
        int N=in.nextInt();
        int fib1=0;
        int fib2=1;
        for(int n=0;n<N-2;n++){
            int fib3=fib2+fib1;
            int temp=fib1;
            fib1=fib2;
            fib2=fib3;
        }
        System.out.print("The nth term of fibonacci="+fib2);
    }
}
