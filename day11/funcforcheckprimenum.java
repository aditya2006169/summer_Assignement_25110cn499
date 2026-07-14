public class funcforcheckprimenum {
    public static void main(String[] args) {
        prime(7);
    }
    public static void prime(int a) {
        int count =0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println("the number "+ a +" is prime number");
            }
            else{
                System.out.println("the number "+ a +" is not a prime number");
            }
        
    }
}
