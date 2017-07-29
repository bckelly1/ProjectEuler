/**
 * Created by brian on 7/27/15.
 */
public class Problem7 {
    public static void main(String[] args){
        int number_of_primes = 0;
        int lastPrime = 0;
        int index = 1;
        while(number_of_primes < 10001){
            index++;
            if(is_prime(index)){
                lastPrime=index;
                number_of_primes++;
            }
        }
        System.out.println("10001th Prime:  " + lastPrime);
    }

    static boolean is_prime(int n){
        for(int i=2;i<n;i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
