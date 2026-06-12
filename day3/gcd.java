import java.util.Scanner;
public class gcd {    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number A:");
        int A=in.nextInt();
        System.out.print("Please enter the number B:");
        int B=in.nextInt();
        while(B>0){
              int R=A%B;
              A=B;
              B=R;
        }
        System.out.print("GCD="+A);
    }
}

