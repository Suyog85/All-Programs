package AccentureCoding;

import java.util.Scanner;

public class LeaderProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the array elements ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }


    int sum=0;
    
    for(int i=0; i<n;i++){
      int j;
      for ( j = i+1; j<n;j++){
        if(arr[i]<=arr[j]){
          break;
        }
      }

      if(j==n){
        sum+=arr[i];
      }
    }
    System.out.println("Sum of leaders "+sum);

  }
}
