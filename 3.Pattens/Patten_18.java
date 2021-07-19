import java.util.Scanner;

public class Patten_18 {
    //       if n = 3 then
    //       ***
    //       **
    //       *
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int x = i;
        while (j <= i){
            int k = 1;
            while (k <= x){
                System.out.print("*");
                k++;
            }
            System.out.println();
            x--;
            j++;
        }
    }
}
