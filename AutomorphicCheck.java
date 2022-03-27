
public class AutomorphicCheck
{
    boolean checkAutomorphic(int num){
        boolean automorphic = false;
        int count = 0, copy = num;
        while(copy > 0){
            count++;
            copy /= 10;
        }
        int sq = (int)Math.pow(num, 2);
        int extractor = sq % (int)Math.pow(10,count);
        if(extractor == num){
            automorphic = true;
        }
        return automorphic;
    }
}
