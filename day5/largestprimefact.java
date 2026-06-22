import java.util.Scanner;
public class largestprimefact {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number:");
        int N=in.nextInt();
        int largest=0;        
        for(int n=1;n<=N;n++){
            int rem=N%n;
            if(rem==0){
                int count=0;
                for(int m=1;m<=n;m++){
                    int rem2=n%m;
                    if(rem2==0){
                    count++;
                    }
                }    
                    if(count==2||count==1){
                        largest=n;
                    }
                
            }
        }   
        System.out.println("the largest prime factor="+largest);     
    }
}
