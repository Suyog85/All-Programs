package ArrayChallanges;

import java.util.Scanner;

public class OccurencesArray {
  public static void main(String[] args) {
    System.out.println("Welcome to array occurance ");
    Scanner input= new Scanner(System.in);
    int[] numArr= ArryUtility.inputArray();

    System.out.print("Now enter the number you want to find: ");
    int num= input.nextInt();
    int occurance=noOfOccurences(numArr, num);
    System.out.println(" Your elent was found "+occurance+ " times.");

  }
  public static int noOfOccurences(int[] numArr, int num){
    int occ=0;
    int i=0;
    while(i<numArr.length){
      if(numArr[i]==num){
        occ++;
      }
      i++;
    }
    return occ;
  }
}
