public class Problem2 {
    public static void main(String args[]) {
        int total = 0;
        int index = 1;
        int fibon = 0;
        while(fibon < 4000000){
            fibon = fibonacciRecusion(index);
            if(fibon % 2 == 0){
                total = total + fibon;
            }
            index++;
        }
        System.out.println("Total: " + total);
    }

    // Java program for Fibonacci number using recursion.
    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }
}
