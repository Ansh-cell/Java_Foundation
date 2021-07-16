import java.util.Scanner;

public class while_loop {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = 1;
        while (j <= i){
            System.out.println(j);
            j = j + 1;
        }
    }
}
