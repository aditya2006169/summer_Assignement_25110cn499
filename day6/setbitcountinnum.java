import java.util.Scanner;
public class setbitcountinnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int N=in.nextInt();
        int binary=0;
        int place=1;
        while(N>0){
            int rem=N%2;
            binary=binary+rem*place;
            place=place*10;
            N=N/2;       
        }
        int count=0;
        while(binary>0){
            int rem2=binary%10;
            if(rem2*1==1){
                count++;
            }else{
            }
            binary=binary/10;
        }
        System.out.print("the sets bit count="+count); 
    }
}
