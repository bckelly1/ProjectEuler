/**
 * Created by brian on 5/25/15.
 */
public class Problem1 {
    public static void main(String args[]){
        int sum=0;
        for(int i=3; i<1000; i++){
            if((i%3==0 && i>=3) || (i%5==0 && i>=5)){
                sum=sum+i;
            }
        }
        System.out.println("sum =" + sum);
    }
}
