package AccentureCoding;

import java.util.Scanner;

public class LeaderProblem2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter the element of an array ");
    for(int i= 0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int sum=arr[n-1];
    int maxRight=arr[n-1];

    for(int i =n-2;i>=0;i--){
      if(arr[i]>maxRight){
      
        maxRight=arr[i];
        sum=sum+arr[i];
      }
  }
  System.out.println("Sum of leadetr is "+sum);
  }
}
