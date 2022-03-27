
/**
 * Write a description of class GradeTernary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeTernary
{
 public static void main(int marks)
 {
     System.out.println(marks < 40 ? "D" : (marks >= 40 && marks <= 59 ? "C" : (marks >= 60 && marks <=79 ? "B":"A")));
 }
}
