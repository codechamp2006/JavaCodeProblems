import java.util.*;
public class MonthLeapYear {
    public static void main(){
        int year,month,days = 0;
        String leap;
        Scanner scan = new Scanner(System.in);
        System.out.print("Month Number : ");
        month = scan.nextInt();
        System.out.print("Year : ");
        year = scan.nextInt();
        
        switch(month){
            case 1: System.out.println("Month : January");
                    break;
            case 2: System.out.println("Month : February");
                    break;
            case 3: System.out.println("Month : March");
                    break;
            case 4: System.out.println("Month : April");
                    break;
            case 5: System.out.println("Month : May");
                    break;
            case 6: System.out.println("Month : June");
                    break;
            case 7: System.out.println("Month : July");
                    break;
            case 8: System.out.println("Month : August");
                    break;
            case 9: System.out.println("Month : September");
                    break;
            case 10: System.out.println("Month : October");
                    break;
            case 11: System.out.println("Month : November");
                    break;
            case 12: System.out.println("Month : December");
                    break;        
        }
        if(year % 4 == 0 && year % 100 != 0){
            leap = "True";
        }
        else if(year % 4 == 0 && year % 100 == 0){
            leap = "False";
        }
        else if(year % 400 == 0){
            leap = "True";
        }
        else{
            leap = "False";
        }
        if(leap == "True"){
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
                case 2: days = 29;
                         break;
                default: System.out.println("Wrong");
            }
        }
        else{
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
                case 2: days = 28;
                         break;
                default: System.out.println("Wrong");
            }
        }
        System.out.println(days);
    }
}
