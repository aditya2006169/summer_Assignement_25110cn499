import java.util.Arrays;
public class secondlargest {
    public static void main(String[] args) {
        int [] arr ={2,6,35,7,9,4};
        secondlargest(arr);
    }
    public static void secondlargest(int [] arr) {
        int largest=arr[0];  
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int secondlargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondlargest&&arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}
