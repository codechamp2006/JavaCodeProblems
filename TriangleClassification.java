
/**
 * Write a description of class TriangleClassification here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleClassification
{
    public static void main(double A, double B ,double C)
    {
        // taking three angles of the triangle as input
        if (A + B + C == 180)
        {
        if(A==B && B==C && A==C)
        System.out.println("Equilateral Triangle");
        else if(A > 90 || B > 90 || C > 90)
        System.out.println("Obtuse Triangle");
        else if(A < 90 && B < 90 && C < 90)
        System.out.println("Acute Triangle");
        else if(A == 90 || B == 90 || C ==90)
        System.out.println("Right Triangle");
        else 
        System.out.println("Sorry, the triangle cannot be classified ");
        }
        else 
        System.out.println("The triangle cannot be formed ?!");
    }
}
