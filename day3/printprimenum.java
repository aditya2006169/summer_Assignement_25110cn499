
import java.util.Scanner;

public class printprimenum {
                    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int N=in.nextInt();
        int countn;
        int n;
        int m;
        for(m=1;m<=N;m++){
            countn=0;
            for(n=1;n<=m;n++){
                if(m%n==0){
                    countn++;
                }
            }
            if(countn==2){
                System.out.println(m+"");
            }else{

            }
        }
    }
}
