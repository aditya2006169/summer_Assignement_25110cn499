import java.util.Scanner;
public class sumofnum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int sum=0;
        for(int n=1;n<=N;n++){
            sum=sum+n;
        }
        System.out.println("Sum="+sum);
    }
}
