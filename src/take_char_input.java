import java.util.Scanner;

public class take_char_input {
    public static void main(String[] Args){
        System.out.print("Enter only 2 character String: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char c = s.charAt(0);
        char c2 = s.charAt(1);
        System.out.print("First character: ");
        System.out.println(c);
        System.out.print("Second Character: ");
        System.out.println(c2);
    }
}
