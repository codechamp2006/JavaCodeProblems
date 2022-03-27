import java.util.*;
public class Pattern2 {
    public static void main(){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.print("No of rows : ");
        int rows = scan.nextInt(); // take input for number of rows
        // outer for-loop
        for(int i = 1; i <= rows; i++){
            // inner for-loop to display fibonnaci terms
            a = 1; 
            b = 0; 
            c = 0;
            for(int j = 1; j <= i; j++){
                c = a + b;
                System.out.print(c);
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}