
public class firstTenPell
{
    public static void main(){
        int term, sum = 0, previous = 1;
        for(int i = 1; i <= 10; i++){
            term = i * 2 - previous;
            sum += term;
            previous = term;
        }
    }
}
