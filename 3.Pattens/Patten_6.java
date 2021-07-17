import java.util.Scanner;

public class Patten_6 {
    //       if i = 4 then
    //       1111
    //       2222
    //       3333
    //       4444
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            while (k <= i){
                System.out.print(j);
                k++;
            }
            System.out.println();
            j++;
        }
    }
}
