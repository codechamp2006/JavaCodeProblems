import java.util.*;
public class PrimeFibonacci
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        int a, b,c;
        a = 1;
        b = 0;
        c = 0;
        for(int i = 1; i <= n;){
            c = a + b;
            a = b;
            b = c;
            int count = 0;
            for(int j = 1; j <= c; j++){
                if(c % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(c);
                i++;
            }
        }
    }
}
