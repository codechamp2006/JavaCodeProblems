import java.util.*; 
public class PISeries {
    public int takeN(){
    int n;  
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter value of n : ");
    n = scan.nextInt();
    return n;
}
    public double nInit(){
        int n = takeN();
        // initializing variables
        int sgn = 1,denominator=1;
        double sum1 = 0.0,sum2=0.0,term;
        // for loop to calculate sum
        for(int i = 1;i <= n; i++){
            term = (4/denominator) * sgn;
            sum1 = sum1 + term;
            sgn *= -1;
            denominator += 2;
        }
        denominator = 1; // reinitialize
        sgn = 1;
        n += 500;
        for(int i = 1; i <= n; i++){
            term = (4/denominator) * sgn;
            sum2 = sum2 + term;
            sgn *= -1;
            denominator += 2;
        }
        double pi = Math.PI;
        double diff1 = Math.abs(pi-sum1);
        double diff2 = Math.abs(pi-sum2);
        
        if(diff2 < diff1)
        System.out.println("Proved!");
        return sum1;
    }
    public double nIncrease(){
        int n = takeN();
        // initializing variables
        int sgn = 1,denominator=1;
        double sum2=0.0,term;
        
        // for loop to calculate sum
        for(int i = 1;i <= n; i++){
            term = (4/denominator) * sgn;
            sum2 = sum2 + term;
            sgn *= -1;
            denominator += 2;
        }
        return sum2;
    }
    public boolean diff(){
        boolean check = false;
        double sum1 = nInit();
        double sum2 = nIncrease();
        double pi = Math.PI;
        double diff1 = Math.abs(pi-sum1);
        double diff2 = Math.abs(pi-sum2);
        if(diff2 < diff1)
        check = true;
        return check;
    }
    public void main(boolean check){
        check = diff();
        if(check == true)
        System.out.println("Proved!");
        else
        System.out.println("Not Proved!");
    }
}
