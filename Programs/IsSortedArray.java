package ArrayChallanges;

public class IsSortedArray {
  public static void main(String[] args) {

    int[] numArr = ArryUtility.inputArray();
    boolean isInc = isIncreasing(numArr);
    boolean isDec = isDecreasing(numArr);
    if (isInc || isDec) {
      System.out.println(" Your Array is sorted");
    } else {
      System.out.println("Your array is not sorted");
    }

  }

  public static boolean isIncreasing(int[] numArr) {
    int i = 1;
    while (i < numArr.length) {
      if (numArr[i] < numArr[i - 1]) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static boolean isDecreasing(int[] numArr) {
    int i = 1;
    while (i < numArr.length) {
      if (numArr[i] > numArr[i - 1]) {
        return false;
      }
      i++;
    }
    return true;
  }
}