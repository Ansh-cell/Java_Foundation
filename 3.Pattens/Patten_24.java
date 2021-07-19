import java.util.Scanner;

public class Patten_24 {
    //       if n = 4 then
    //       1
    //      121
    //     12321
    //    1234321
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int spaces = i - 1;
        while (j <= i){
            int k = 1;
            while (k <= (spaces)){
                System.out.print(" ");
                k++;
            }
            spaces--;
            int l = 1;
            while (l <= j){
                System.out.print(l);
                l++;
            }
            int z = 1;
            int dec = j;
            while (z <= (j - 1)){
                System.out.print(dec - 1);
                z++;
                dec--;
            }
            System.out.println();
            j++;
        }
    }
}
