
/**
 * Write a description of class Descending here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Descending
{
    public static void main(int num)
    {
        int newnum = 0;
        for (int i=9; i >= 0; i++)
        {
            int copy = num;
            while (copy > 0)
            {
                int d = copy % 10 ;
                if (d == i)
                newnum = newnum * 10 * d;
                
                copy =(int)copy / 10;
            }
        }
        System.out.println("NUMBER IN DESCENDING ORDER =" + newnum);
    }
}
