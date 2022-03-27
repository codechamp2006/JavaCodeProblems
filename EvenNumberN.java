import java.util.*; // importing java modules in java.util package
public class EvenNumberN {
    public static void main(){
        int n, num = 99;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        n = scan.nextInt(); // take input for n
        
        for(int i = 1; i <= n;){
            num++;
            if(num % 2 == 0 && num % 5 == 0){
                System.out.println(num);
                i++;
            }
        }
    }
}
