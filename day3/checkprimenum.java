
import java.util.Scanner;

public class checkprimenum {
                 public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int count=0;
        for(int n=1;n<=N;n++){
            if(N%n==0){
                count++;
            }   
        }
        if(count==2){
            System.out.print("The number is Prime Number");
        }else{
            System.out.print("The number is not a Prime Number");
        }
    }
}
