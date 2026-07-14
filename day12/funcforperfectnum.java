public class funcforperfectnum {
    public static void main(String[] args) {
        perfect(7);
    }
    public static void perfect(int N){
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
