package ArrayChallanges;
public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Wellcome to sum and Average");
        int[] numArray= ArryUtility.inputArray();
        long sum=sum(numArray);
        double average=average(numArray);
        System.out.println("Sum of the number is "+ sum);
        System.out.println("Avearge of the number is "+ average);
        
    }
    public static long sum(int[] numArray){
        int sum=0;
        for(int i=0;i<numArray.length;i++){
            sum+= numArray[i];
        }
        return sum;
    }

    public static double average(int[] numArray){
        long sum = sum(numArray);
        return  (sum/numArray.length);
    }
}
