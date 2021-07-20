import java.util.Scanner;

public class Bitwise_Operator {
    public static void main(String[] Args){
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        int j = n.nextInt();
        // Bitwise AND
        System.out.println(i & j);
        // Bitwise OR
        System.out.println(i | j);
        // Bitwise NOT
        System.out.println(~i);
        System.out.println(~j);
        // Bitwise XOR
        System.out.println(i ^ j);
        // Right shift
        System.out.println(i >> 1);
        // Left shift
        System.out.println(j << 1);
    }
}
