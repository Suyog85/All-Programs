package ArrayChallanges;

public class PalindromeArray {
  public static void main(String[] args) {
    int[] numArr = ArryUtility.inputArray();
    boolean isPalin = isPalindrome(numArr);
    if (isPalin) {
      System.out.println("Your Array is Palindrome");
    }else{
      System.out.println("YOur Array is not Palindrome");
    }
  }

  public static boolean isPalindrome(int[] numArr){
    for(int i=0; i<numArr.length/2; i++){
      if (numArr[i] != numArr[numArr.length-1-i]) {
        return false;
        
      }
    }
    return true;
  }
}
