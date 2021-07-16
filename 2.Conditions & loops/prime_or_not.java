import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int j = 2;
        while (j < (number - 1)){
            if (number % j == 0){
                System.out.print("It is not a prime number");
                return;
            }
            else{
                j = j + 1;
            }
        }
        System.out.print("It is a prime number");
    }
}
