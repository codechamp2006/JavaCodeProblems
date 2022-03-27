import java.util.*;
public class TriangularNumber
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt(); // input number
        int sum = 0;
        int i = 1;
        boolean equals = false;
        while(equals == false){
            sum = sum + i;
            if(sum == num){
                equals = true;
                System.out.println("Triangular number");
            }
            else if(sum > num){
                equals = true;
                System.out.println("Not triangular number");
            }
            else{
                i++;
            }
        }
    }
}
