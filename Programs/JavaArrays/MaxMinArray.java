package ArrayChallanges;

public class MaxMinArray {
  public static void main(String[] args) {
    System.out.println("Welcome to Min and Max ");
    int[] numArr= ArryUtility.inputArray();
    int max = max(numArr);
    int min = min(numArr);
    System.out.println("Max Number in Array is "+max);
    System.out.println("Min Number in Array is "+min);
  }
  public static int min(int[] numArr){

    int min= Integer.MAX_VALUE;
    for (int i = 0; i<numArr.length; i++){
      
      if(min>numArr[i]){
        min=numArr[i];
      }
    }
    return min;
  }

  public static int max(int[] numArr){
    int max = Integer.MIN_VALUE;
      for (int i = 0; i<numArr.length; i++){
        if(max<numArr[i]){
          max=numArr[i];
        }
      }
    return max;
  }
  
}
