import java.util.*;
public class TwoSetOfTimeSecs
{
    public static void main ()
    {
        int hr1,min1,sec1,hr2,min2,sec2;
        // input using Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Time 1 : ");
        System.out.print("Hours : ");
        hr1 = scan.nextInt();
        System.out.print("Minutes : ");
        min1 = scan.nextInt();
        System.out.print("Seconds : ");
        sec1 = scan.nextInt();
        
        System.out.println("Time 2 : ");
        System.out.print("Hours : ");
        hr2 = scan.nextInt();
        System.out.print("Minutes : ");
        min2 = scan.nextInt();
        System.out.print("Seconds : ");
        sec2 = scan.nextInt();
        // initialization of three variables 
        int finalsec; 
        int finalhr;
        int finalmin;
        
        // adding seconds
        finalsec = sec1 + sec2; // adding the two seconds
        finalsec = finalsec - 60;
        
        // adding minutes
        finalmin = min1 + min2 + 1;
        finalmin = finalmin - 60;
        
        // adding hours
        finalhr = hr1 + hr2 + 1;
        
        System.out.println("Time : " + finalhr + " " + finalmin + " " + finalsec);
    } // end of method
} // end of class
