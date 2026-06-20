import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = in.nextInt();

        int original = N;
        int temp = N;
        int temp2 = N;

        int count = 0;
        int result = 0;

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
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }

        in.close();
    }
}