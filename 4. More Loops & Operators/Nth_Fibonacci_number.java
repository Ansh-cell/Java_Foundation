import java.util.Scanner;

public class Nth_Fibonacci_number {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int num = 0;
        int f1 = 1;
        int f2 = 1;
        for (int j = 1; j <= i; j++){
            if (i == 1 || i == 2){
                System.out.println(1);
                return;
            }
            else if (j == 1 || j == 2){
                f1 = 1;
                f2 = 1;
            }
            else {
                num = f1 + f2;
                f1 = f2;
                f2 = num;
            }
        }
        System.out.println(num);
    }
}
