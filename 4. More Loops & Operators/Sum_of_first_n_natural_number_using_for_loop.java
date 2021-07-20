import java.util.Scanner;

public class Sum_of_first_n_natural_number_using_for_loop {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int sum = 0;
        for (int j = 0; j <= i; j++){
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
