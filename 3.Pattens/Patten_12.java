import java.util.Scanner;

public class Patten_12 {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int inner_loop = 1;
            int val = j;
            while (inner_loop <= j){
                System.out.print(val);
                val--;
                inner_loop++;
            }
            System.out.println();
            j++;
        }
    }
}
