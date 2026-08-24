package Recursion;

public class FindSubsets {
  static void findSubsets(
      String str,
      int idx,
      String ans) {

    if (idx == str.length()) {
      System.out.println(ans);
      return;
    }

    // Don't choose current character
    findSubsets(
        str,
        idx + 1,
        ans);

    // Choose current character
    findSubsets(
        str,
        idx + 1,
        ans + str.charAt(idx));
  }

  public static void main(String[] args) {

    findSubsets("abc", 0, "");
  }
}
