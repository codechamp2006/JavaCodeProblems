
/**
 * Write a description of class FibonacciSeries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciSeries
{
    public static void main(int n)
    {
        int a = 1;
        int b = 0;
        int c;
        for(int i=1; i <=n; i++)
        {
           c = a + b;
           System.out.println(c);
           a = b;
           b = c;
        }
    }
}
