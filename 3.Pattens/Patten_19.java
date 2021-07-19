import java.util.Scanner;

public class Patten_19 {
    //       if n = 3 then
    //       333
    //       22
    //       1
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int x = i;
        while (j <= i){
            int k = 1;
            while (k <= x){
                System.out.print(i - j + 1);
                k++;
            }
            x--;
            System.out.println();
            j++;
        }
    }
}
