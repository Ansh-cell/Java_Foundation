import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        System.out.print("Enter c: ");
        int c = scan.nextInt();

        if (a >= b && a >= c){
            System.out.print("Largest Number is: " + a);
        }
        else if (b >= c && b >= a){
            System.out.print("Largest Number is: " + b);
        }
        else{
            System.out.print("Largest Number is: " + c);
        }
    }
}
