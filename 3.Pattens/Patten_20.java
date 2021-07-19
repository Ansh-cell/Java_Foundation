import java.util.Scanner;

public class Patten_20 {
    //       if n = 4 then
    //       *
    //      ***
    //     *****
    //    *******
    public static void main(String[] Args) {
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int odd = 1;
        int space = i;
        while (j <= i){
            int k = 1;
            int y = 1;
            while (y <= space){
                System.out.print(" ");
                y++;
            }
            while (k <= odd){
                System.out.print("*");
                k++;
            }
            space--;
            odd = odd + 2;
            System.out.println();
            j++;
        }
    }
}
