package ArrayChallanges;

import java.util.Scanner;

public class ArryUtility {
  public static int[] inputArray() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter the Array Size: ");
    int size = input.nextInt();
    int[] nums = new int[size];
    int i = 0;
    while (i < size) {
      System.out.print("Please enter element no. " + (i + 1) + ": ");
      nums[i] = input.nextInt();
      i++;

    }
    System.out.println();
    return nums;
  }
  public static void displayArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  
}
