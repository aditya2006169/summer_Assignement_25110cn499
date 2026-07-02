import java.util.Scanner;
public class recursivesumofdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= in.nextInt();
        System.out.println("The sum is="+ sumofdigit(n));
    }
    public static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofdigit(n/10);
    }
}
