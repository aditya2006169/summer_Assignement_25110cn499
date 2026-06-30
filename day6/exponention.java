import java.util.Scanner;
public class exponention {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base number:");
        int n=in.nextInt();
        System.out.print("Enter the upper number:");
        int m=in.nextInt();
        //n^m
        int exp=1;
        for(int i=1;i<=m;i++){
            exp=exp*n;
        }

        System.out.println("the exponential number:"+ exp);
    }
}
