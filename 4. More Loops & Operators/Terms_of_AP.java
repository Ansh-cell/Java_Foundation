import java.util.Scanner;

public class Terms_of_AP {
    //  Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
    // sample input: 10
    // output: 5 11 14 17 23 26 29 35 38 41
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int j = 1;
        int count = 1;
        while (j <= N){
            if ((3*count + 2) % 4 == 0){
                count++;
            }
            else {
                System.out.print(3*count + 2);
                System.out.print(" ");
                j++;
                count++;
            }
        }
    }
}
