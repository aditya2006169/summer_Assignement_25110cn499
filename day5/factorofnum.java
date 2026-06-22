package day5;
import java.util.Scanner;
public class factorofnum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Please Enter the number:");
        int N=in.nextInt();
        for(int n=1;n<=N;n++){
            int rem=N%n;
            if(rem==0){
                System.out.println(n);
            }
        }

    }
}
