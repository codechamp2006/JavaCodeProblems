import java.util.*;
public class OddOrEven
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        String check = "";
        for(int i = 0; i <= num; i = i + 2){
            check = num == i ? "Even":"Odd";
        }
        System.out.println(check);
    }
}
