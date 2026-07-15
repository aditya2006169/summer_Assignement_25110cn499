import java.util.Arrays;
public class sumandavgofarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of an array="+ sum);
        float avg=(float)sum/arr.length;
        System.out.println("the average of an array="+ avg);
    }
}
