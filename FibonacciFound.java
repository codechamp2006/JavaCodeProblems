import java.util.*;
public class FibonacciFound
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int a = 1; 
        int b = 0; 
        int c = 0;
        int i = 1;
        boolean found = false;
        while(found == false){
            c = a + b;
            if(num == c){
                System.out.println("Found in fibonacci series!");
                found = true;
            }
            else if(c > num){
                System.out.println("Not found in fibonacci series!");
                found = true;
            }
            else{
                a = b;
                b = c;
            }
        }
    }
}
