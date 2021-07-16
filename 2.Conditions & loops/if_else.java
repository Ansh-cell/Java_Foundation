import java.util.Scanner;

public class if_else {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i % 2 == 0){
            System.out.println("Even");
            return;
        }
        else{
            System.out.println("Odd");
        }
    }
}
