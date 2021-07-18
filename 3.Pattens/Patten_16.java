import java.util.Scanner;

public class Patten_16 {
    //       if n = 3 then
    //       A
    //       BC
    //       CDE
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            char x = (char) ('A' + j - 1);
            while (k <= j){
                System.out.print(x);
                x++;
                k++;
            }
            System.out.println();
            j++;
        }
    }
}

