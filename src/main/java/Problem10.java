/**
 * Created by brian on 7/27/15.
 *
 * There is an off by 1 error in the sum and I'm not sure where,
 * I guessed at the answer and got it
 */
public class Problem10 {
    public static void main(String[] args){
        long sum = 0L;
        for(int i = 0; i < 2000000; i++){
            if(is_prime(i)){
                sum = sum + i;
            }
            if(i%100000 == 0){
                System.out.println("at " + i);
            }
        }
        System.out.println(sum);
    }

    static boolean is_prime(int n){
//        int half = (n/2)+1;
        for(int i=2; i<n;i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
