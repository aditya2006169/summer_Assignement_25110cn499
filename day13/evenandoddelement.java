import java.util.Arrays;
public class evenandoddelement{
    public static void main(String[] args) {
        int [] arr={2,4,2,7,65,6,};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("the element "+ arr[i] +" is even");
            }else{
                System.out.println("the element "+ arr[i] +" is odd");
            }
        }
    }
}
