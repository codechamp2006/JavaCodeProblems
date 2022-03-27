import java.util.*;
public class DayNumber {
    public static void main(){
        int day; // variable for day number
        Scanner scan = new Scanner(System.in);
        System.out.print("Day Number = ");
        day = scan.nextInt(); // input day number
        
        // switch case
        switch(day){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("Invalid day");
        } // end of switch case
    } // end of main method
} // end of class
