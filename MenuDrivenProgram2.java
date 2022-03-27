import java.util.*;
public class MenuDrivenProgram2 {
    public static void main(){
        int num;
        int choice = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scan.nextInt(); // input number
        // while-loop to run until chosen option 4
        while(choice != 4){
          // displays menu and enter choice
          System.out.println("Menu : ");
          System.out.println("1. Check Prime : ");
          System.out.println("2. Check Perfect Square : ");
          System.out.println("3. Check Perfect Number : ");
          System.out.println("4. Exit : ");
          System.out.println("Enter your choice : ");
          choice = scan.nextInt(); // input choice
          
          // switch case
          switch(choice){
                  case 1: int count=0; // counts no of factors
                          // for-loop to count factors
                          for(int i = 1; i <= num; i++){
                              if (num % i == 0)
                              count += 1; // increment count by 1
                            }
                          // conditions for printing
                          if (count == 2)
                          System.out.println("Prime Number");
                          else
                          System.out.println("Not Prime Number");
                          break;
                  case 2: // variables required
                          double SQRoot,difference;
                          int SquareRoot;
                          SQRoot = Math.sqrt(num); // square root
                          SquareRoot = (int)SQRoot; // convert to int
                          difference = SQRoot - SquareRoot;
                          // conditions checking
                          if(difference == 0.0)
                          System.out.println("Perfect Square");
                          else
                          System.out.println("Not Perfect Square");
                          break;
                  case 3: // variables required
                          int sum = 0, factor=0;
                          // for-loop
                          for(int i = 1; i <= num; i++){
                              if (num % i == 0){
                                  factor = i;
                                  sum += factor;
                                }
                            }
                          // conditions to check perfect number
                          if (sum == num)
                          System.out.println("Perfect Number");
                          else
                          System.out.println("Not Perfect Number");
                          break;
                  case 4: break;
                  default: System.out.println("Invalid Choice!");
          }
    }
    }
}
