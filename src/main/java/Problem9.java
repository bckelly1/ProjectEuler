/**
 * Created by brian on 7/27/15.
 */
public class Problem9 {
    public static void main(String[] args){
        for(int a = 0; a <= 1000; a++){
            for(int b = 0; b <= 1000; b++){
                for(int c = 0; c <= 1000; c++){
                    if(theorem(a,b,c)){
                        if(a+b+c==1000 && a<b && b<c){
                            System.out.println(a*b*c);
                        }
                    }
                }
            }
        }
    }




    static boolean theorem(int a, int b, int c){
        a = (a*a);
        b = (b*b);
        c = (c*c);
        return (a + b) == c;
    }
}
