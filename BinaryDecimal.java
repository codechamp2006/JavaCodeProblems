import java.util.*;
public class BinaryDecimal
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int dec_value = 0;
 
        // Initializing base
        int base = 1;
 
        int copy = num;
        while (copy > 0) {
            int last_digit = copy % 10;
            copy = copy / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
        System.out.println("Decimal : " + dec_value);
    }
}
