
public class DigitProperties2
{
    public static void main(){
        // loop only through 2 digit numbers
        for(int i = 10; i <= 99;){
            // take each number and square it
            int num = i;
            int squaredNum = (int)Math.pow(num,2);
            // reverse the squared number
            int count = 0;
            int copy = squaredNum;
            int reversedNum = 0;
            // counts the number of digits of the squaredNumber
            while(copy > 0){
                count++;
                copy = (int)copy/10;
            }
            // main reverse process
            count = count - 1;
            int digitMultiplier = 1;
            while(squaredNum > 0){
                int digit = squaredNum % (int)Math.pow(10,count);
                digitMultiplier = (int)Math.pow(10,count);
                reversedNum += digit * digitMultiplier;
                // decrease count and squaredNum
                count--;
                squaredNum = (int)squaredNum / 10;
            }
            // get the square root of the reversed squared number
            int sqrt = (int)Math.sqrt(reversedNum);
            // check if the number of digits is 2
            copy = sqrt;
            int rcount = 0;
            while(copy > 0){
                rcount++;
                copy = (int)copy/10;
            }
            if(rcount == 2){
                // continue checking
                rcount--;
                int first_digit = (sqrt % 10) * 10;
                int last_digit = sqrt / 10;
                int reversed = first_digit + last_digit;
                if(reversed == num){
                System.out.println(num);
            }
            }
            else{
                i++;
            }
            // else continue iteration
        }
    }
}
