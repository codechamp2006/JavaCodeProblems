import java.util.*;
public class Octal2decimal
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scan.nextInt();
        
        int copy = num;
        int count = 0;
        while(copy > 0){
            count++;
            copy/= 10;
        }
        int decimalNum = 0;
        count--;
        int d = 0;
        int newcount = 0;
        while(num != 0){
            d = num % (int)Math.pow(10,count);
            if(newcount != count){
                decimalNum += (int)Math.pow(8,newcount) * d;
            }
            newcount++;
            num /= 10;
        }
        System.out.println("Decimal number : " + decimalNum);
    }
}
