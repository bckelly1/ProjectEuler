import java.util.HashSet;
import java.util.Set;

/**
 * Created by brian on 7/27/15.
 */
public class Problem3 {
    public static void main(String args[]) {
        System.out.printf("Prime factors of number '%d' are : %s %n", 35, primeFactors(600851475143L));
    }
    public static Set primeFactors(long number) {
        long i;
        Set prime_factors = new HashSet<>();
        long copyOfInput = number;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                prime_factors.add(i); // prime factor
                copyOfInput /= i;
                i--;
            }
        }
        return prime_factors;
    }
}
