import java.util.Scanner;

public class Patten_23 {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int space = (i - 1) * 2;
        while (j <= i){
            int y = 1;
            while (y <= space){
                System.out.print(" ");
                y++;
            }
            space = space - 2;
            int k = 1;
            int val = 1;
            while (k <= j){
                System.out.print(val);
                k++;
                val++;
            }
            System.out.println();
            j++;
        }
    }
}
