import java.util.Scanner;

public class Patten_1 {
    //       1
    //       12
    //       123
    //       1234
    public static void main(String[] Args){
        Scanner scan  = new Scanner(System.in);
        int number = scan.nextInt();
        int i = 1;
        while (i <= number){
            int j = 1;
            while (j <= i){
                System.out.print(j);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
