
public class TriangularNumber2
{
    public static void main(){
        for(int i = 10; i <= 99; i++){
            int num = i;
            boolean equals = false;
            int sum = 0;
            int j = 1;
            while(equals == false){
                sum = sum + j;
                if(sum == num){
                    System.out.println(num);
                }
                else if(sum > num){
                    equals = true;
                }
                else{
                    j++;
                }
            }
    }
}
}
