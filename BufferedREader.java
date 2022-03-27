import java.io.*;
public class BufferedREader
{
    void main() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Enter a number : ");
        int num = Integer.parseInt(br.readLine());
        System.out.print("Enter a double : ");
        double doub = Double.parseDouble(br.readLine());
        System.out.print("Enter a sentence : ");
        String str = br.readLine();
        System.out.print("Enter a character : ");
        char ch = br.readLine().charAt(0);
        System.out.println("The numerical data are " + num + " , " + doub + " . The letter-based data are " + str + " , " + ch);
    }
}
