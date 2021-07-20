import java.util.Scanner;

public class For_loop {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        for (int j = 1; j <= i; j++){
            for (int k = 1; k <= j; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
