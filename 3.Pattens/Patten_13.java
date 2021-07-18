import java.util.Scanner;

public class Patten_13 {
    //       if n = 3 then
    //       ABC
    //       ABC
    //       ABC
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int inner_loop = 1;
            char x = (char) 65;
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
