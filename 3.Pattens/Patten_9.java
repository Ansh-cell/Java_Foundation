import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Patten_9 {
    //       if i = 4 then
    //       1
    //       23
    //       345
    //       4567
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            int val = j;
            while (k <= j){
                System.out.print(val);
                val++;
                k++;
            }
            System.out.println();
            j++;
        }
    }
}
