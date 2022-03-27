import java.util.*;
public class AdamNumber
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int count = 0;
        int copy = num;
        while(copy > 0){
            int d = copy % 10;
            count++;
            copy /= 10;
        }
        if(count % 2 == 0){
            int divider = count / 2;
            int first = num / (int)Math.pow(10,divider);
            int last = num % (int)Math.pow(10,divider);
            int sum = first + last;
            double square1 = Math.sqrt(sum);
            int square2 = (int)square1;
            if(square2 == square1){
                System.out.println("Adam Number !");
            }
            else{
                System.out.println("Not Adam Number !");
            }
        }
        else{
            System.out.println("Not Adam Number");
        }
    }
}
