import java.util.Scanner;

public class Patten_21 {
    //       if n = 5 then    ---- odd number only
    //       *
    //      ***
    //     *****
    //      ***
    //       *
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = 1;
        int odd = 1;
        int loop1 = (i + 2 - 1) / 2;
        int upper_space = (i / 2);
        int down_space = 1;
        if (i % 2 == 0){
            System.out.println("Diamond Patten doesn't work with even numbers");
            return;
        }
        while (j <= loop1){
            int k = 1;
            while (k <= upper_space){
                System.out.print(" ");
                k++;
            }
            int l = 1;
            while (l <= odd){
                System.out.print("*");
                l++;
            }
            odd = odd + 2;
            upper_space--;
            j++;
            System.out.println();
        }
        int p = 1;
        int down = loop1 - 1;
        int down2 = i - 2;
        while (p <= down) {
            int x = 1;
            while (x <= down_space) {
                System.out.print(" ");
                x++;
            }
            int z = 1;
            while (z <= down2) {
                System.out.print("*");
                z++;
            }
            down2 = down2 - 2;
            p++;
            System.out.println();
            down_space++;
        }
    }
}
