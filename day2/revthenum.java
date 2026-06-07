
import java.util.Scanner;
public class revthenum {
         public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int rem2=0;
        int rem1=0;
        while(N>0){
            rem1=N%10;
            rem2=rem2*10+rem1;
            N=N/10;
        }
        System.out.print(rem2);
    }
}
