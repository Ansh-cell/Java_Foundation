import java.util.Scanner;

public class Sum_or_Product {
    // Write a program that asks the user for a number N and a choice C.
    // And then give them the possibility to choose between computing the sum and computing
    // the product of all integers in the range 1 to N (both inclusive).
    // If C is equal to:
    //     1, then print the sum
    //     2, then print the product
    //     Any other number, then print '-1' (without the quotes)
    public static void main(String[] Args){
        Scanner N = new Scanner(System.in);
        System.out.print("Enter the Nth Value: ");
        int i = N.nextInt();
        System.out.print("Enter c: ");
        int j = N.nextInt();
        if (j == 1){
            int sum = 0;
            for (int count = 1; count <= i; count++){
                sum = sum + count;
            }
            System.out.println("Result: " + sum);
            return;
        }
        else if (j == 2){
            int product = 1;
            for (int count = 1; count <= i; count++){
                product = product * count;
            }
            System.out.println("Result: " + product);
            return;
        }
        else {
            System.out.print(-1);
            return;
        }
    }
}
