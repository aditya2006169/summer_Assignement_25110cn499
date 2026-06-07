import java.util.Scanner;
public class sumofdig {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int sum=0;
        while(N>0){
            int rem=N%10;
            N=N/10;
            sum=sum+rem;
        }
        System.out.print(sum);
    }
}
