import java.util.Scanner;

public class Patten_3 {
    //       1
    //      23
    //     456
    //   78910
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int val = 1;
        int i = 1;

        while (i <= number){
            int space = 1;
            while (space <= (number - i)){
                System.out.print(" ");
                space = space + 1;
            }
            int j = 1;
            while (j <= i){
                System.out.print(val);
                val = val + 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
