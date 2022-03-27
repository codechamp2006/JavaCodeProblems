import java.util.*;
public class NNumberHCF
{
    void main(){
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        System.out.print("1st number : ");
        int n = scan.nextInt();
        while(exit != true){
            n = scan.nextInt();
            if(n != 0){
                int num = 1;
            }
        }
    }
    int hcf(int a,int b){
        int hcf = 0;
        for(int i = 1; i <= Math.max(a,b); i++){
            if(a % i == 0 && b % i==0){
                hcf = i;
            }
        }
        return hcf;
    }
}
