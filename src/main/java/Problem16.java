import java.math.BigInteger;

/**
 *

 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 2^1000?

 * */

public class Problem16 {
    public static void main(String[] args) {
        BigInteger hugeInteger = BigInteger.valueOf(2).pow(1000);

        String integerString = String.valueOf(hugeInteger);
        System.out.println("original number: " + integerString);

        int count = 0;
        for(int i = 0; i < integerString.length(); i++){
            int placeValue = Integer.valueOf(integerString.charAt(i) + "");
            count +=placeValue;
        }

        System.out.println(count);
    }
}
