import java.util.Scanner;

public class Patten_8 {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            int val = i;
            while (k <= i){
                System.out.print(val);
                val--;
                k++;
            }
            System.out.println();
            j++;
        }
    }
}
