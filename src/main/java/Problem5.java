/**
 * Created by brian on 7/27/15.
 */
public class Problem5 {
    public static void main(String[] args){
        for(int i = 1; i < 399999999; i++){
            if(divisible(i)){
                System.out.println(i);
            }
        }
    }
    static boolean divisible(int input){
        for(int i=1; i<21; i++){
            if(input%i != 0){
                return false;
            }
        }
        return true;
    }
}
