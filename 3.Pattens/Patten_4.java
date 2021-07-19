import java.util.Scanner;

public class Patten_4 {
    //       ****
    //       ****
    //       ****
    //       ****
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            while (k <= i){
                System.out.print("*");
                k = k + 1;
            }
            System.out.println();
            j = j + 1;
        }
    }
}
