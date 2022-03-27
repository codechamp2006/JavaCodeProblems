import java.util.*;
public class EvilNumber
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scan.nextInt();
        int copy = number;
        int binaryNumber = 0;
        int remainder = 0;
        int j = 1;  
        while(copy != 0) {  
            remainder = number % 2;  
            binaryNumber += remainder * j;
            j = j * 10;
            copy = copy / 2;
        } 
        
        int count = 0; 
        while(binaryNumber != 0) {
            if(binaryNumber % 10 == 1){
                count++;
            }
            binaryNumber = binaryNumber / 10;
        }
        
        if(count % 2 == 0){
            System.out.println("Evil Number !");
        }
        else{
            System.out.println("Not Evil Number !");
        }
    }
}
