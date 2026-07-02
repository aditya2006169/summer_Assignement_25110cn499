import java.util.Scanner;
public class recursivefact {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =in.nextInt();
        System.out.print("the factorial is:"+ fact( n));

    }
    public static int fact(int n){
        if( n==0 ||  n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
