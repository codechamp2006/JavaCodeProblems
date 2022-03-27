import java.util.*;
public class FibonacciNTerms
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many terms : ");
        int n = scan.nextInt();
        
        int a = 1, b = 0, c = 0;
        if(n == 1){
            System.out.println("0");
        }
        else if(n <= 2){
            System.out.println("0\n0");
        }
        else if(n == 0){
            System.out.println("Invalid input!");
        }
        else{
            System.out.println("0\n0");
            for(int i = 3; i <= n; i++){
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
