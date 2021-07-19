import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Patten_15 {
    //       if n = 3 then
    //       A
    //       BB
    //       CCC
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            while (k <= j){
                System.out.print((char) ('A' + j - 1));
                k++;
            }
            System.out.println();
            j++;
        }
    }
}
