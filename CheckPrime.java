import java.util.*;
public class CheckPrime
{
    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int sum = sumofDivisor(num);
        if(sum == 1){
            System.out.println("Prime number ");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    int sumofDivisor(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        return sum;
    }
}
