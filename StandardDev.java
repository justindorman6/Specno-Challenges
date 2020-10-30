
public class StandardDeb {


    public static void main(String[] args) {
        int numArr [] = {1,2,3,4,5};
        System.out.println(standardDev(numArr));
    }
    
    public static double standardDev (int [] numArr) 
    {
        int sum = 0;
        int sd = 0;
        
        for (int num : numArr) {
            sum += num;
        }
        
        double mean = sum/numArr.length;
        
        for (int num : numArr) {
            sd += Math.pow(num - mean, 2);
        }
        
        return Math.sqrt(sd - numArr.length);
    }
    
}
