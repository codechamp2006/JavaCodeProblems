import java.util.*;
public class Pattern3 {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = scan.nextInt(); // take input for number of rows
        // outer for-loop
        for(int i = 1; i <= rows; i++){
            // inner for-loop to display each term
            for(int j = 1; j <= rows; j++){
                // condition
                if (i == 1 || j == 1 || i == rows || j == rows){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
