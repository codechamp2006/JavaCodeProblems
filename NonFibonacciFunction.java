
public class NonFibonacciFunction
{
    int nthfib(int n){
        int i, a = 1, b = 0, c = 0;
        for(i = 1; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    
    void main(int n){
        for(int i = 1; i <= n;i++){
        }
    }
}
