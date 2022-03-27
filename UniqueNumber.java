import java.util.*;
public class UniqueNumber
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scan.nextInt();
        
        // while-loop to count number of digits
        int copy = num;
        int d1 = 0, d2 = 0 , d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0 , d8 = 0, d9 = 0, d0 = 0;
        // while-loop to count number of digits
        int d = 0;
        while(num > 0){
            d = num % 10;
            switch(d){
                case 1: d1++;
                        break;
                case 2: d2++;
                        break;
                case 3: d3++;
                        break;
                case 4: d4++;
                        break;
                case 5: d5++;
                        break;
                case 6: d6++;
                        break;
                case 7: d7++;
                        break;
                case 8: d8++;
                        break;
                case 9: d9++;
                        break;
                case 0: d0++;
                        break;
                default: System.out.println(" ");
            }
            num /= 10;
        }
        if(d1 <= 1 && d2 <= 1 && d3 <= 1 && d4 <= 1 && d5 <= 1 && d6 <= 1 && d7 <= 1 && d8 <= 1 && d9 <= 1 && d0 <= 1){
            System.out.println("Unique number !");
        }
        else{
            System.out.println("Not unique number !");
        }
    }
}
