public class funcforfindmaxnum {
    public static void main(String[] args) {
        max(3,5,8);
    }
    public static void max(int a,int b,int c){
        if(a>b&&a>c){
            System.out.println("the max number is "+ a);
        }
        if(b>a&&b>c){
            System.out.println("the max number is "+ b);
        }
        if(c>b&&a<c){
            System.out.println("the max number is "+ c);
        }
    }
}
