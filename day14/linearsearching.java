import java.util.Arrays;
public class linearsearching {
   public static void main(String[] args) {
    int [] arr={2,4,5,7,8,9};
    System.out.println(linsearch(arr, 5));
   } 
   static int linsearch(int [] arr,int target){
    if(arr.length==0){
        return -1;
    }
    for(int i=0;i<arr.length;i++){
        int element=arr[i];
        if(element==target){
            return i;
        }
    }
    return -1;
  }
}