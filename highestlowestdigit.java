import java.util.*;
public class highestlowestdigit
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int highest = 1, lowest = 9;
        while(num > 0){
            int d = num % 10;
            if(d > highest){
                highest = d;
            }
            else if(d < lowest){
                lowest = d;
            }
            else{
                continue;
            }
            num /= 10;
        }
        System.out.println("Highest digit : " + highest + " Lowest digit : " + lowest);
    }
}
