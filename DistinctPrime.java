import java.util.*;
public class DistinctPrime
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        
        for(int i = 1; i <= num; i++){
            int factor = 0;
            if(num % i == 0){
                factor = i;
                int count = 0;
                for(int j = 1; j <= factor; j++){
                    if(factor % j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.println(i);
                }
            }
        }
    }
}
