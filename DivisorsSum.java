import java.util.*; //importing all the java modules in java.util package
public class DivisorsSum {
    public static void main(){
        // initializing variables
        int a,b,sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        a = scan.nextInt(); // take input for a 
        System.out.print("Enter 2nd number = ");
        b = scan.nextInt(); // take input for b
        // formatting the output of common factors
        System.out.println("The common factors are : ");
        // running a for-loop to display the common factors
        for(int i=2;i < a;i++){
            if(a % i == 0 && b % i == 0){
                // displaying the common factor
                System.out.println(i);
                // adding the common factor
                sum = sum + i;
            }
        }
        // displaying the sum
        System.out.println("The sum of the common divisors is " + sum);
    }
}
