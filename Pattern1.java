import java.util.*;
public class Pattern1 {
    public static void main(){
        int product = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("No of rows : ");
        int row = scan.nextInt(); // take input for number of rows
        // outer-for loop 
        for(int i = 1; i <= row; i++){
            // inner for-loop
            for(int j = 1; j <= i; j++){
                product = i * j;
                System.out.print(product);
            }
            System.out.println();
        }
    }
}
