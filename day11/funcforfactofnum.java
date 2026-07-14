public class funcforfactofnum {
    public static void main(String[] args) {
        fact(5);
    }
    public static void fact(int a) {
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("the factorial is "+ fact);
    }
}
