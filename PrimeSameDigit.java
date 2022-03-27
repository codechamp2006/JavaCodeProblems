public class PrimeSameDigit
{
    public static void main(){
        for(int i = 1000; i <= 9999; i++){
            int count = 0;
            boolean Prime = false;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                Prime = true;
            }
            else{
                Prime = false;
            }
            int lastDigit = i % 10;
            int firstDigit = i % 1000;
            if(lastDigit == firstDigit && Prime == true){
                System.out.println(i);
            }
        }
    }
}
