import java.util.Scanner;

public class lcm {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number A:");
        int A=in.nextInt();
        System.out.print("Please enter the number B:");
        int B=in.nextInt();
        int N=A*B;
        while(B>0){
              int R=A%B;
              A=B;
              B=R;
        }
        //A*B=GCD*LCM
        int L=N/A;
        System.out.print("LCM="+L);
    }
}
