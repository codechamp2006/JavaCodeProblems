import java.util.*;
public class TwinPrime
{
    public void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Limit : ");
        int limit = scan.nextInt();
        int t1, t2 = 0;
        boolean t1prime, t2prime = false;
        for(int i = 1; i <= limit - 2; i++){
            t1 = i;
            t2 = i + 2;
            t1prime = checkPrime(t1);
            t2prime = checkPrime(t2);
            if(t1prime == true && t2prime == true){
                System.out.println(t1 + " , " + t2);
            }
        }
    }
    boolean checkPrime(int num){
        boolean prime = false;
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            prime = true;
        }
        return prime;
    }
}
