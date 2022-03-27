import java.util.*;
public class SeriesDisplay4descend
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height : ");
        int height = scan.nextInt();
        for(int i = 1; i <= height; i++){
            for(int k = 1; k <= i - 1; k++){
                System.out.print(" ");
            }
            for(int j = i; j <= height; j++){
                System.out.print(j);
            }
            for(int j = height; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
