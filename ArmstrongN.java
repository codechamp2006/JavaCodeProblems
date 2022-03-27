import java.util.*;
public class ArmstrongN
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        int starting = (int)Math.pow(10,n-1);
        int ending = (int)Math.pow(10,n);
        int count = 0;
        for(int i = starting; i < ending; i++){
            int copy = i; 
            int digit, sum = 0;
            while(copy >= 0){
                int d = copy % 10;
                digit = (int)Math.pow(d,n);
                sum += digit;
                copy /= 10;
            }
            if(count > 5 && sum == i){
                System.out.println(sum);
                count++;
            }
        }
    }
}
