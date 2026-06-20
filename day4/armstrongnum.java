import java.util.Scanner;
public class armstrongnum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = in.nextInt();
    for(int n=1;n<=N;n++){ 
        int original = n;
        int temp = n;
        int temp2 = n;

        int count = 0;
        int result = 0;
    // for(n=1;n<=N;n++){
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        while (temp2 > 0) {
            int rem = temp2 % 10;

            int mult = 1;

            for (int i = 0; i < count; i++) {
                mult = mult * rem;
            }

            result = result + mult;
            temp2 = temp2 / 10;
        }

        if (result == original) {
            System.out.println(original);
        } else {
            // System.out.println(original);
        }
    }
 }
}