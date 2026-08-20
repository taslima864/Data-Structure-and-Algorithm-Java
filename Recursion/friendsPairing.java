package Recursion;

public class friendsPairing {
  public static int solution(int n) {
    if (n == 1 || n == 2) {
      return n;
    }
    // choice
    // single
    // int fnm1 = solution(n - 1);
    // // pair
    // int fnm2 = solution(n - 2);
    // int pairways = (n - 1) * fnm2;

    // // toWays
    // int toWays = fnm1 + pairways;
    // return toWays;
    return solution(n - 1) + (n - 1) * solution(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(solution(3));

  }

}
