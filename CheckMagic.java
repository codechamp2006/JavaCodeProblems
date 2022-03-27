import java.util.*;
public class CheckMagic
{
    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int digitsum = sumOfDigits(num);
        while(digitsum > 9){
            digitsum = sumOfDigits(digitsum);
        }
        if(digitsum == 1){
            System.out.println("Magic Number");
        }
        else{
            System.out.println("Not magic number");
        }
    }
    int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            int d = num % 10;
            sum+=d;
            num /= 10;
        }
        return sum;
    }
}
