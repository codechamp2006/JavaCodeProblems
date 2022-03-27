import java.util.*;
public class PatternProb3 {
    public static void main(){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        n = scan.nextInt(); // take input for n
        int count = n;
        for(int i = 1; i <= n; i++){
            for(int k = count; k >=1; k--){
                System.out.print(" ");
            }
            for(int j = i; j >=1; j--){
                System.out.print(j);
            }
            System.out.println();
            count--;
        }
    }
}
