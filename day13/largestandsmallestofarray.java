import java.util.Arrays;
public class largestandsmallestofarray {
    public static void main(String[] args) {
        int [] arr = {4,6,2,7,1,9};
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
