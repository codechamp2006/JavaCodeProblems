import java.util.*;
public class Pattern4 {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = scan.nextInt(); // take input for number of rows
        // outer for-loop
        for(int i = 1; i <= rows; i++){
            // condition to print 1st letter
            if(i == 1 || i == rows){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
            // inner for-loop
            for(int j = 1; j < i; j++){
                // condition 
                if(j % 2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
