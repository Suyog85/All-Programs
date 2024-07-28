import java.util.Scanner;

public class CheckAdult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18) {
            System.out.println("User is an Adult");

        }
        else{
            System.out.println("USer is not an Adult");
        }
    }
}
