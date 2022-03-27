
public class ArmstrongCheck
{
    boolean checkArmstrong(int num){
        boolean armstrong = false;
        int count = 0, copy = num, sum = 0;
        while(copy > 0){
            count++;
            copy /= 10;
        }
        copy = num;
        while(copy > 0){
            int d = copy % 10;
            int term = (int)Math.pow(d, count);
            sum += term;
            copy /= 10;
        }
        if(sum == num){
            armstrong = true;
        }
        return armstrong;
    }
}
