import java.util.ArrayList;
import java.util.List;

/**
 * Created by brian on 7/29/15.
 */
public class Problem14 {
    static int longest = 0;
    static List<Integer> chain = new ArrayList<>();
    public static void main(String[] args){
        int starter;
        int cycles = 0;
        for(int i = 0; i < 1000000; i++){
            List<Integer> this_chain = new ArrayList<>();
            starter = i;
            while(starter > 0) {
                cycles++;
                this_chain.add(starter);
                if (starter % 2 == 0) {
                    starter = even_collatz(starter);
                } else {
                    starter = odd_collatz(starter);
                }
                if(starter == 1){
                    this_chain.add(starter);
                    cycles++;
                    break;
                }
            }
            if (cycles > longest){
                longest = cycles;
                chain = this_chain;
            }
            cycles = 0;
        }
        System.out.println("Longest: " + longest);
        System.out.println("Chain: ");
        int c = 0;
        for(int index : chain){
            System.out.print(index + " ");
            c++;
            if(c % 20 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
    static int even_collatz(int input){
        return input/2;
    }
    static int odd_collatz(int input){
        return (3*input)+1;
    }
}
