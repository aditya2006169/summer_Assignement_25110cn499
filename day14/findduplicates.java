import java.util.Arrays;
public class findduplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,34,5,7,8,8,9,2,34};
        duplicates(arr);
    }
    public static void duplicates(int [] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&i!=j){
                    System.out.println("the duplicates is "+ arr[i]);
                }
            }
        }
    }
    
}
