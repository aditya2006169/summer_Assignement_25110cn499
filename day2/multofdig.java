
import java.util.Scanner;
public class multofdig{
         public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int mul=1;
        while(N>0){
            int rem=N%10;
            N=N/10;
            mul=mul*rem;
        }
        System.out.print(mul);
    } 
}

