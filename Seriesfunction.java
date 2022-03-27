
public class Seriesfunction
{
    public static void main(int n){
        int factrl = 0, sum = 0;
        for(int i = 1; i <= n; i++){
            factrl = factorial(i);
            sum += factrl;
        }
        System.out.println("Sum = " + sum);
    }
    static int factorial(int k){
        int f = 1, j;
        for(j = 1; j <= k; j++){
            f *= j;
        }
        return f;
    }
}
