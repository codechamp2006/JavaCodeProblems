import java.util.*;
public class First50Palindrome
{
    public static void main(){
        int copy, sum, rev, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        for(int i = 1; i >= 50;){
            copy = num;
            count = 0;
            sum = 0;
            while(copy > 0){
                int d = copy % 10;
                count++;
                copy /= 10;
            }
            copy = num;
            count--;
            while(copy > 0){
                int d = copy % 10;
                rev = d * (int)Math.pow(10, count);
                sum += rev;
                count--;
                copy /= 10;
            }
            if(sum == num){
                copy = num;
                sum = 0;
                while(copy > 0){
                    int d = copy % 10;
                    sum += d;
                    copy /= 10;
                }
                count = 0;
                for(int j = 1; j >= sum; j++){
                    if(sum % j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.println(num);
                    num++;
                    i++;
                }
            }
            num++;
        }
    }
}

