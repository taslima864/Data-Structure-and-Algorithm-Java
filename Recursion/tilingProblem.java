package Recursion;

public class tilingProblem {
  public static int ways(int n) {
    // base case
    if (n == 0 || n == 1) {
      return 1;
    }
    // vertical choice
    int fnm1 = ways(n - 1);

    // horizontal choice
    int fnm2 = ways(n - 2);

    int totWays = fnm1 + fnm2;
    return totWays;
  }

  public static void main(String[] args) {
    System.out.println(ways(3));
  }
}
