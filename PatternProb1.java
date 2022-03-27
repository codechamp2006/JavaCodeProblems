import java.util.*;
public class PatternProb1 {
    public static void main(){
        int n;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        n = scan.nextInt(); // take input for n
        // outer-for loop
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = count; k >= 1; k--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            count += 2;
        }
    }
}
