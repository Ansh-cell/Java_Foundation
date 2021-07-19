import java.util.Scanner;

public class Patten_7 {
    //       if i = 4 then
    //       1234
    //       1234
    //       1234
    //       1234
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            while (k <= i){
                System.out.print(k);
                k++;
            }
            System.out.println();
            j++;
        }
    }
}
