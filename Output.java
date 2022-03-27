
public class Output {
    public static void main(){
        int x = 8, y = 7, z;
        z = x + y-- ;
        x = z++ + y--;
        System.out.println(x + y + z);
    }
}
