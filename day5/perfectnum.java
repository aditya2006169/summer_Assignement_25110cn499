import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int N=in.nextInt();
        int original=N;
        int temp=N;
        int sum=0;
        for(int n=1;n<temp;n++){
            int rem=temp%n;
            if(rem==0){
                sum=sum+n;
            }
        }
        if(sum==original){
            System.out.println("The number is Perfect number");
        }else{
            System.out.println("The number is not a Perfect number");
        }
    }
}
