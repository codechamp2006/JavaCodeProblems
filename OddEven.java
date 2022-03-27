
public class OddEven
{
    public static void main(int num)
    {
       // making the last digit 0 without modifying original number
       int n1 = (num/10) * 10;
       // taking out the last digit by difference
       int diff = num - n1;
       // conditions for even or odd
       if(diff == 0 || diff == 2 || diff == 4 || diff == 6 || diff == 8)
       System.out.println("Even");
       else
       System.out.println("Odd");
    }
}
