import java.util.*;
public class PatternDay1 {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = scan.nextInt(); // take input
        
        for(int i = 1; i <= rows; i++ ){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            for(int j = rows; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
