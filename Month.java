import java.io.*;
public class Month
{
    public static void main() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        // input year number and month number
        System.out.print("Enter year : ");
        int year = Integer.parseInt(br.readLine());
        System.out.print("Enter month : ");
        int month = Integer.parseInt(br.readLine());
        boolean LeapYear = false; // leap year variable
        int days = 0;
        
        // check for leap year
        if (year % 400 == 0 || (year % 100!=0 && year % 4 == 0))
        {
            LeapYear = true;
        }
        else 
        LeapYear = false;
        
        // switch-case
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31;
                     break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30;
                     break;
            case 2: if(LeapYear == true){
                      days = 29;
                    }
                    else{
                      days = 28;
                    }
                   break;
            default: System.out.println("Error!");
        }
        // display number of days
        System.out.println("Number of days = " + days);
    }
}
