
import java.util.Scanner;
public class fact {
            public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int fact=1;
        int N=in.nextInt();
        for(int n=1;n<=N;n++){
            fact=fact*n;
        }
        System.out.print(fact);
    }
}
