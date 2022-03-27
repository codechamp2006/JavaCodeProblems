
import java.util.*; // import the java modules in java.util Package
public class GradeMarks {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Marks : ");
        int marks = scan.nextInt(); // take input for marks
        
        // divide marks by 10
        int marksConvert = marks / 10;
        String grade;
        // switch --- case
        switch(marksConvert){
            case 0 :
            case 1:
            case 2:
            case 3: grade = "D";
                    break;
            case 4:
            case 5: grade = "C";
                    break;
            case 6:
            case 7: grade = "B";
                    break;
            case 8:
            case 9: grade = "A";
                    break;
            default : grade = "Wrong input";
        }
        // print the grade
        System.out.println("Grade = " + grade);
    }
}
