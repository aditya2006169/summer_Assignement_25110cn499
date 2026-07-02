import java.util.Scanner;
public class recursivereversethenum {
    static int rev=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        System.out.print("The reversed number:"+ reversethenumber(n));

    }
    public static int reversethenumber(int n){
        if(n==0){
            return rev;
        }
        rev=rev*10+(n%10);
        return reversethenumber(n/10);
    }
}
