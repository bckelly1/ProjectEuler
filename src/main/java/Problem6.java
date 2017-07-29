/**
 * Created by brian on 7/27/15.
 */
public class Problem6 {
    public static void main(String[] args){
        System.out.println(square_of_sum(100) - sum_of_squares(100));
    }

    static int sum_of_squares(int in){
        int sum = 0;
        for(int i=0; i<=in; i++){
            sum = sum + (i * i);
            System.out.print(sum + " ");
        }
        System.out.println("\nSum of Squares: " + sum);
        return sum;
    }

    static int square_of_sum(int in){
        int sum = 0;
        for(int i = 0; i <= in; i++){
            sum = sum + i;
            System.out.print(sum + " ");
        }
        System.out.println("\nSquare of sums: " + sum * sum);
        return sum * sum;
    }
}
