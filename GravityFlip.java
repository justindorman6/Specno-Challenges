
import java.util.Arrays;

public class GravityFlip {

    public static void main(String[] args) {
        int testRight[] = {3, 2, 1, 2};
        int testLeft[] = {1, 4, 5, 3, 5};

        System.out.println(Arrays.toString(GravityFlip(testRight, 'R')));
        System.out.println(Arrays.toString(GravityFlip(testLeft, 'L')));
    }

    public static int[] GravityFlip(int[] initial, char direction) {
        if (direction == 'R') {
            Arrays.sort(initial);
        } else {
            Arrays.sort(initial);
            
            //reverse array
            for (int i = 0; i < initial.length / 2; i++) {
                int temp = initial[i];
                initial[i] = initial[initial.length - i - 1];
                initial[initial.length - i - 1] = temp;
            }
        }
        return initial;
    }

}
