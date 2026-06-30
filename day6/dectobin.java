import java.util.Scanner;
public class dectobin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int N=in.nextInt();
        int binary=0;
        int place=1;
        while(N>0){
            int rem=N%2;
            binary=binary+rem*place;
            place=place*10;
            N=N/2;
        }
        System.out.println("Binary equivalent: " + binary);
    }
}
