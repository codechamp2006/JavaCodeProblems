import java.util.*;
public class Pattern
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = i; k <= n - 1; k++){
                System.out.print(" ");
            }
            for(int k = n; k >= i + 1; k--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
