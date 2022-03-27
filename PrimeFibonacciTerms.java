
public class PrimeFibonacciTerms
{
    public static void main(){
        int a = 1, b = 0, c = 0;
        for(int i = 1; i <= 100; i++){
            c = a + b;
            int count = 0;
            for(int j = 1; j <= c; j++){
                if(c % j == 0){
                    count++;
                }
            }
            a = b;
            b = c;
            if(count == 2){
                System.out.println(c);
            }
        }
    }
}
