import java.util.Scanner;

public class Patten_17 {
    //       if n = 3 then where 3 = C
    //       C
    //       BC
    //       ABC
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int y = 'A' + i - 1;
        while (j <= i){
            int k = 1;
            char x = (char) (y);
            while (k <= j){
                System.out.print((char)(x-j+1));
                x++;
                k++;
            }
            System.out.println();
            j++;
        }
    }
}

