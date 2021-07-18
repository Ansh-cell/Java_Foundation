import java.util.Scanner;

public class Patten_11 {
    //       if n = 3 then
    //       1
    //       22
    //       333
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int inner_loop = 1;
            while (inner_loop <= j){
                System.out.print(j);
                inner_loop++;
            }
            System.out.println();
            j++;
        }
    }
}
