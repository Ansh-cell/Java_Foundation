import java.util.Scanner;

public class All_prime_numbers {
    // Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
    // Print the prime numbers in different lines.
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        boolean check_prime = true;
        for (int j = 2; j <= i; j++){
            for (int k = 2; k < (j - 1); k++){
                if (j % k == 0){
                    check_prime = false;
                    break;
                }
            }
            if (check_prime == true){
                System.out.println(j);
            }
            check_prime = true;
        }
    }
}
