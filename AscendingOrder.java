import java.util.*;
public class AscendingOrder {
    public static void main(){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        a = scan.nextInt(); // take input for a
        System.out.print("Enter 2nd number : ");
        b = scan.nextInt(); // take input for b
        System.out.print("Enter 3rd number : ");
        c = scan.nextInt(); // take input for c
        
        int first_num = Math.min(a,b);
        first_num = Math.min(first_num,c); // smallest
        int third_num = Math.max(a,b);
        third_num = Math.max(third_num,c); // largest
        // second number
        int sum = a + b + c;
        int two_sum = first_num + third_num;
        int middle_num = sum - two_sum;
        System.out.println(first_num);
        System.out.println(middle_num);
        System.out.println(third_num);
    }
}
