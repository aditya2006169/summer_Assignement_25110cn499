public class charpyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("-");
            }
            for(char k='A';k<i+'A';k++){
                System.out.print(k);
            
            
            }
            {
                for(int l=i-2;l>=0;l--){
                    System.out.print((char)('A'+l));
                }
            }
            System.out.println(" ");
        }
    }
}