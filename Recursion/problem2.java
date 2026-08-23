package Recursion;

public class problem2 {
  static String digits[] = {
      "zero", "one", "two", "three", "four",
      "five", "six", "seven", "eight", "nine"
  };

  public static void printDigits(int number) {

    // Base Case
    if (number == 0) {
      return;
    }

    // Get last digit
    int lastDigit = number % 10;

    // Recursive call
    printDigits(number / 10);

    // Print the word
    System.out.print(digits[lastDigit] + " ");
  }

  public static void main(String[] args) {
    printDigits(1947);
  }
}
