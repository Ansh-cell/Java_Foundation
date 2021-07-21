import java.util.Scanner;

public class Reverse_of_a_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int reverse = 0;
        while(n>0) {
            int a=n%10;
            reverse = reverse * 10 + a;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
