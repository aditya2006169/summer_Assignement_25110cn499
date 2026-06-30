import java.util.Scanner;
public class bintodec {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.print("Please Enter the Binary Number:");
    int N=in.nextInt();
    int dec=0;
    int rem=0;
    int mult=1;
    while(N>0){
        rem=N%10;
        dec=dec+(rem*mult);
        mult=mult*2;
        N=N/10;
    }
    System.out.println("the decimal number="+ dec);
    }
}
