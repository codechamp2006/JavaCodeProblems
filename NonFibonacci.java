import java.util.*;
public class NonFibonacci
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scan.nextInt();
        int i, j, a = 1, b = 0, c;
        for(i = 1; i <= n;){
            c = a + b;
            for(j = b + 1; j < c; j++){
                if(i <= n){
                    System.out.println(j);
                    i++;
                }
            }
            a = b;
            b = c;
        }
    }
}
