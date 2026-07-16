import java.util.Arrays;
public class frequencyofelement {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,4,4,5,5,6,6,7,7,7,7,7,7,7,7};
        freq(arr,7);
    }
    public static void freq(int [] arr , int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
