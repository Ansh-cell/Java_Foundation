import java.util.Scanner;

public class Input_from_user {

    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First No: ");
        int i = scan.nextInt();
        System.out.print("Enter Second No: ");
        int j = scan.nextInt();
        int k = i + j;
        System.out.print("Result: ");
        System.out.print(k);
    }
}
