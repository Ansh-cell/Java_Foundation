import java.util.Scanner;

public class Patten_22 {
    //       if n = 5  then
    //          1
    //         232
    //        34543
    //       4567654
    //      567898765
    public static void main(String[] Args) {
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int space = i - 1;
        int val2 = 2;
        while (j <= i){
            int l = 1;
            while (l <= space){
                System.out.print(" ");
                l++;
            }
            int k = 1;
            int val = j;
            while (k <= j){
                System.out.print(val);
                k++;
                val++;
            }
            if (j != 1){
                int e = 1;
                int val3 = val2;
                while (e <= (j - 1)){
                    System.out.print(val3);
                    e++;
                    val3--;
                }
                val2 = val2 + 2;
            }
            space--;
            j++;
            System.out.println();
        }

    }
}
