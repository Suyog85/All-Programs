package AccentureCoding;

import java.util.Scanner;

public class PasswordValidator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Password ");

    String password = sc.nextLine();

    if (isValidPassword(password)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  public static boolean isValidPassword(String password) {
    // Check the length of the password
    if (password.length() < 4) {
      return false;
    }
    // Check if the first character is a number
    if (Character.isDigit(password.charAt(0))) {
      return false;
    }

    boolean hasDigit = false;
    boolean hasUpperCase = false;

    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);

      if (Character.isDigit(ch)) {
        hasDigit = true;
      }
      if (Character.isUpperCase(ch)) {
        hasUpperCase = true;

      }

      if (ch == ' ' || ch == '/') {
        return false;
      }
      
    }
    // Check if the password contains at least one digit and one uppercase letter
    if (!hasDigit || !hasUpperCase) {
      return false;
    }
    return true;
  }
}
