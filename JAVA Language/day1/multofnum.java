import java.util.Scanner;
public class multofnum {
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int mult;
        int N=in.nextInt();
        for(int n=1;n<=10;n++){
            mult=n*N;
            System.out.println(mult);        
        }
        }
}
