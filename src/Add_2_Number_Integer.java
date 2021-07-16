public class Add_2_Number_Integer {
    // short -> 2 bytes -> -32,768 to 32,767
    // int -> 4 bytes -> -2,147,483,648 to 2,147,483,647
    // long -> 8 bytes-> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    // float -> 4 bytes -> Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    // double -> 8 bytes -> Stores fractional numbers. Sufficient for storing 15 decimal digits
    // char -> 2 bytes -> Stores a single character/letter or ASCII values
    // boolean -> 1 bit -> Stores true or false values
    public static void main(String[] Args){
        int i = 10;
        int j = 20;
        int k = i + j;
        System.out.print(k);
    }
}
