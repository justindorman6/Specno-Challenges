import java.util.Arrays;

public class Xbonacci {

    public static void main(String[] args) {
        double[] test = {1, 1, 1, 1};
        System.out.println(Arrays.toString(xbonacci(test, 10)));
    }

    
    public static double[] xbonacci(double[] signature, int n) {
        double[] result = new double[n];
        int sigSize = signature.length;

        for (int i = 0; i < n; i++) {
            if (i < sigSize) {
                result[i] = signature[i];
            } else {
                for (int j = 0; j < sigSize; j++) {
                    result[i] += result[i - (j + 1)];
                }
            }
        }

        return result;
    }

}
