import java.util.*;
public class GenerateSame
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("No of digits: ");
        int digits = scan.nextInt();
        
        int start = (int)Math.pow(10, digits-1);
        int end = (int)Math.pow(10, digits);
        // loop
        for(int i = start; i < end; i++){
            int d1 = 0;
            int d2 = 0;
            d1 = i / (int) Math.pow(10, start);
            if(d1 == 3){
                System.out.println(i);
            }
        }
    }
}
