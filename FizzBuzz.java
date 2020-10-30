
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzbuzz(10)));
    }

    public static Object[] fizzbuzz(int n) {
        Object[] mixed = new Object[n];

        for (int i = 0; i < n; i++) {
            int num = i+1;
            if (num % 3 == 0 && num % 5 == 0) {
                mixed[i] = "FizzBuzz";
            } else if (num % 3 == 0) {
                mixed[i] = "Fizz";
            } else if (num % 5 == 0) {
                mixed[i] = "Buzz";
            } else {
                mixed[i] = num ;
            }
        }
        return mixed;
    }

}
