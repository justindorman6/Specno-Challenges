
public class Average {


    public static void main(String[] args) {
        int [] arg = {1,2,3,4,5};
        System.out.println(average(arg));
    }
    
    public static double average (int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return (sum/arr.length);
    }
    
}
