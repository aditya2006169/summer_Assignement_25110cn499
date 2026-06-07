import java.util.Scanner;
public class count {
            public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int count=0;
        while(N>0){
            int rem=N%10;
            N=N/10;
            count++;
        }
        System.out.print(count);
    }
}
