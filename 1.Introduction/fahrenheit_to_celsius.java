import java.util.Scanner;

public class fahrenheit_to_celsius {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit: ");
        int fahrenheit = scan.nextInt();
        int celsius =((fahrenheit-32)*(5))/9;
        System.out.print(celsius);
    }
}
