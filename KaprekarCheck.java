
public class KaprekarCheck
{
    boolean checkKaprekar(int num){
        boolean kaprekar = false;
        int copy = num, sum = 0, p1, p2 = 0, count = 0;
        while(copy > 0){
            count++;
            copy /= 10;
        }
        int sq = (int)Math.pow(num,2);
        p2 = sq % (int)Math.pow(10,count);
        p1 = sq / (int)Math.pow(10,count);
        sum = p1 + p2;
        if(sum == num){
            kaprekar = true;
        }
        return kaprekar;
    }
}
