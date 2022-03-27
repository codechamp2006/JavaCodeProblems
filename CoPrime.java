import java.util.*;
public class CoPrime
{
    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("1st number : ");
        int num1 = scan.nextInt();
        System.out.print("2nd number : ");
        int num2 = scan.nextInt();
        int gethcf = hcf(num1,num2);
        if(gethcf == 1){
            System.out.println("Coprime");
        }
        else{
            System.out.println("Not Coprime");
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
