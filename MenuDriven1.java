import java.util.*;
public class MenuDriven1 {
    public static void main(){
        int choice; // choice variable
        double term = 0;
        int n;
        Scanner scan = new Scanner(System.in);
        // displaying menu
        System.out.println(" Menu : ");
        System.out.println("1. To display the series x - x^2/2! + x^3/3!");
        System.out.println("2. To display the first n terms of the pell series");
        System.out.println("3. To display all the 3 digit palindrome number");
        System.out.println("4. Exit");
        // input choice
        System.out.print("Enter your choice : ");
        choice = scan.nextInt();
         
        // while loop to continuously run the program until exited
        while(choice != 4){
            // switch case to perform the necessary operations
            switch(choice){
                case 1: System.out.print("Value of x : ");
                        int x = scan.nextInt(); // input value of x
                        System.out.print("Enter limit : ");
                        n = scan.nextInt(); // input n
                        // variables required
                        int factorial = 1;
                        int sgn = 1;
                        
                        // for-loop to display the series
                        for(int i = 1; i <= n; i++){
                            factorial = factorial * i;
                            term = ((Math.pow(x,2))/factorial) * sgn;
                            System.out.println(term);
                            sgn *= -1;
                        }
                        break;
                case 2: System.out.print("Enter n : ");
                        n = scan.nextInt();
                        // Required variables
                        int f=1,s=0,t;
                        // for-loop to display pell series
                        for(int i = 1; i <= n; i++){
                             t=f+s*2;
                             System.out.println(t);
                             f=s;
                             s=t; 
                        }
                        break;
                case 3: int d1=0,d3 = 0; // digit extracting integers
                        // for-loop to extract the digits
                        for(int i = 100; i <= 999; i++){
                            d3 = i % 10;
                            d1 = i % 1000;
                            // conditions to check palindrome
                            if(d1 == d3){
                            System.out.println(i);
                        }
                        else{
                            continue;
                        }
                        }
                        break;
                case 4: break;
                default: System.out.println("Wrong choice");
            }
        }
    }
}
