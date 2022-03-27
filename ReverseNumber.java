import java.util.*;
public class ReverseNumber
{
    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int rev = reverse(num);
        System.out.println("Reverse : " + rev);
        if(rev == num){
            System.out.println("Palindrome Number too! ");
        }
    }
    int reverse(int num){
        int rev = 0;
        while(num > 0){
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        return rev;
    }
}
