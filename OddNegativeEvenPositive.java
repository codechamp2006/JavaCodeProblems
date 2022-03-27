import java.util.*;
public class OddNegativeEvenPositive
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        int oddnegcount = 0, evenposcount = 0,totalcount = 0;
        double avg = 0.0;
        while(stop != true){
            int num = scan.nextInt();
            if(num == -99){
                stop = true;
            }
            else if(num < 0 && Math.abs(num) % 2 == 1){
                oddnegcount += 1;
            }
            else if(num > 0 && num % 2 == 0){
                evenposcount += 1;
            }
            else{
                continue;
            }
            if(num < 0){
                int absolutenum = num * -1;
                avg += absolutenum;
            }
            else{
                avg += num;
            }
            if(num != -99){
                totalcount += 1;
            }
        }
        avg = avg / totalcount;
        System.out.println("Odd Negative Count : " + oddnegcount);
        System.out.println("Even Positive Count : " + evenposcount);
        System.out.println("Average of absolute values : " + avg);
    }
}
