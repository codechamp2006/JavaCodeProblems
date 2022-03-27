import java.util.*; // importing all the modules in java.util package
public class HCF {
    public static void main(){
        // intializing variables
        int a,b,hcf=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        a = scan.nextInt(); // take input for a
        System.out.print("Enter 2nd number : ");
        b = scan.nextInt(); // take input for b
        
        // running a for-loop to get the HCF
        for(int i = 1; i <= a; i++){
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        // displaying the hcf 
        System.out.println("The HCF of " + a + " and " + b + " is " + hcf);
    }
}
