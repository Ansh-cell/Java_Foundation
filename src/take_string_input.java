import java.util.Scanner;

public class take_string_input {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s2 = scan.nextLine();
        String result = s + s2;
        System.out.print(result);
    }
}
