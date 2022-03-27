
public class Pop {
    public static void main(){
        int flandpop;
        int clandpop = 5800000;
        double ratefland = 0.04;
        double ratecland = 0.02;
        double years = 0;
        for(flandpop = 4500000;flandpop <= clandpop; years++){
            flandpop += flandpop * ratefland;
            clandpop += clandpop * ratecland;
        }
        System.out.println("No of years required = " + years);
    }
}
