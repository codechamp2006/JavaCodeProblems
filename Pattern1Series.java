import java.util.Scanner;
public class Pattern1Series
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit : ");
        int n = scan.nextInt();
        for(int i = n; i >= 1; i--){
            int count = 0;
            for(int j = 1; j <= i;j++){
                count += 1;
                System.out.print(j);
            }
            if(count < n){
                int diff = n - count;
                while(diff > 0){
                    System.out.print(count);
                    diff -= 1;
                }
            }
            System.out.println();
        }
    }
}
