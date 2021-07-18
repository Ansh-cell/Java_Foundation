import java.util.Scanner;

public class Patten_14 {
    //       if n = 3 then
    //       ABC
    //       BCD
    //       CDE
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int inner_loop = 1;
            char x = (char) ('A' + j - 1);
            while (inner_loop <= i){
                System.out.print(x);
                x++;
                inner_loop++;
            }
            System.out.println();
            j++;
        }
    }
}
