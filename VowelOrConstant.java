import java.util.*;
public class VowelOrConstant {
    public static void main(){
        String letter;
        Scanner scan = new Scanner(System.in);
        System.out.print("Letter : ");
        letter = scan.next();
        char ch = letter.charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Vowel");
                      break;
            default : System.out.println("Consonant");
        }
    }
}
