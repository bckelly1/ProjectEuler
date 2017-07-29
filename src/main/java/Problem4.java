import java.util.ArrayList;
import java.util.List;

/**
 * Created by brian on 7/27/15.
 */
public class Problem4 {
    public static void main(String args[]) {
        List<Integer> array = new ArrayList<>();
        for(int i=0; i<1000; i++){
            for(int o=0;o<1000; o++){
                String result = String.valueOf(i*o);
                if(string_checker(result) && !array.contains(i*o)){
                    array.add(i*o);
                }
            }
        }
        int largest=0;
        for(int i : array){
            if(i > largest){
                largest=i;
            }
        }
        System.out.println(largest);
    }

    static boolean string_checker(String first){
        if(first.length() %2 == 0){
            for(int i=0; i<first.length(); i++){
                if(first.charAt(i) != first.charAt(first.length()-1-i) ){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
}
