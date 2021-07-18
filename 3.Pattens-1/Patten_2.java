import java.util.Scanner;

public class Patten_2 {
    //       1
    //       23
    //       456
    //       78910
    public static void main(String[] Args){
        Scanner scan  = new Scanner(System.in);
        int number = scan.nextInt();
        int i = 1;
        int k = 1;
        while (i <= number){
            int j = 1;
            while (j <= i){
                System.out.print(k);
                k = k + 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}