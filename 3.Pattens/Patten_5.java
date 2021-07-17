import java.util.Scanner;

public class Patten_5 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = 1;
        while (j <= i){
            int k = 1;
            while (k <= i){
                System.out.print(i);
                k++;
            }
            System.out.println();
            j++;
        }
    }
}
