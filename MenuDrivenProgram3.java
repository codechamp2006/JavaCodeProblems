import java.util.*;
public class MenuDrivenProgram3 {
    public static void main(){
        int choice=1,n;
        Scanner scan = new Scanner(System.in);
        // displaying menu
        System.out.println("Menu : ");
        System.out.println("1. To display series x - x^2/2! + x^3/3! .... ");
        System.out.println("2. To display 1st n terms of pell series ");
        System.out.println("3. To display all the 3 digit palindrome numbers : ");
        System.out.println("4. Exit ");
       
        // while-loop
        while(choice != 4){
            System.out.print("Enter your choice : ");
        
            choice = scan.nextInt(); // take input for choice
            // switch-case
        switch(choice){
            case 1: // input for n
                    System.out.print("Value of n : ");
                    n = scan.nextInt();
                    System.out.print("Value of x : ");
                    int x = scan.nextInt(); // take input for x
                    int factorial = 1, term = 0, sgn = 1;
                    // for-loop to display series
                    for(int i = 1; i <= n; i++){
                        
                    }
                    break;
                }
        }
    }
}
