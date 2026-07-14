
public class funcforpalindrome {
    public static void main(String[] args) {
      palindrome(123454321);
    }
    public static void palindrome(int N) {
        int temp=N;
        int rem2=0;
        int rem1=0;
        while(N>0){
            rem1=N%10;
            rem2=rem2*10+rem1;
            N=N/10;
        }
        if(rem2==temp){
            System.out.print("Yes the number is Palindrome");

        }else{
            System.out.print("No the number is not a Palindrome");

        }
    }
}
