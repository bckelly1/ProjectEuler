/**
 * Created by brian on 7/29/15.
 */
public class Problem12 {
    static int max = 0;
    public static void main(String[] args){
        long rolling_sum = 0L;
        for(int i = 1; i < 10000; i++){
            rolling_sum = rolling_sum + i;
            if(number_of_factors(rolling_sum) > 500){
                System.out.println(" Yes ");
            }
        }
    }

    static int number_of_factors(long input){
        int count = 0;
        long half = (input/2)+1;
        for(int i = 1; i < half; i++){
            if(input%i == 0){
                count++;
            }
//            if(count > 200){
//                System.out.println(count + " primes at " + input);
//            }
//            else if(count > 300){
//                System.out.println(count + " primes at " + input);
//            }
            else if(count > 400){
                System.out.println(count + " primes at " + input);
            }
            else if(count > 450){
                System.out.println(count + " primes at " + input);
            }
        }
        if(count > max){
            System.out.println("new max: " + count + " from " + input);
            max = count;
        }
        return count;
    }
}
