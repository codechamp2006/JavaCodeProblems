
public class CheckPalindrome4
{
    void main(){
        for(int i = 1000; i <= 9999; i++){
            int rev = reverse(i);
            if(i == rev){
                System.out.println(i);
            }
        }
    }
    int reverse(int num){
        int copy = num, rev = 0, count = 3;
        copy = num;
        while(copy > 0){
            int d = copy % 10;
            int term = (int)Math.pow(10, count);
            rev+=term;
            count--;
            copy /= 10;
        }
        return rev;
    }
}
