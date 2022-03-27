
public class DisariumCheck
{
    boolean checkDisarium(int num){
        boolean disarium = false;
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
            count--;
            copy /= 10;
        }
        if(sum == num){
            disarium = true;
        }
        return disarium;
    }
}
