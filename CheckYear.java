import java.util.*;
public class CheckYear {
    public static void main(){
        int year; // variable for year
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year : ");
        year = scan.nextInt(); // input for year
        
        // checking conditions
        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("Century year and leap year");
            }
            else{
                System.out.println("Century year");
            }
        }
        else if(year % 4 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Neither century year, nor leap year");
        }
    }
}
