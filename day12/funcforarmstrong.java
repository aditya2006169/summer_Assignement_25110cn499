public class funcforarmstrong {
    public static void main(String[] args) {
       armstrong(153); 
    }
    public static void armstrong(int N) {
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
    }
}
