import java.util.*;
public class MagicNumber
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int copy = num;
        int sum = 0, count = 0;
        while(copy > 0){
            int d = copy % 10;
            count++;
            copy /= 10;
        }
        copy = num;
        for(int i = 1; i <= count+1; i++){
            while(copy > 0){
                int d = copy % 10;
                sum+=d;
                copy /= 10;
            }
            copy = sum;
            sum = 0;
        }
        if(copy == 1){
            System.out.println("Magic Number !");
        }
        else{
            System.out.println("Not magic number !");
        }
    }
}
