package Recursion;

public class Problem1 {
  public static void solution(int n) {

    if (n == 1) {
      System.out.print(n + " ");
      return;
    }

    solution(n - 1);

    System.out.print(n + " ");
  }

  public static int solution2(int n) {

    if (n == 1) {
      return 1;
    }

    int snm1 = solution2(n - 1);
    int Sn = n + snm1;
    return Sn;
  }

  public static void main(String[] args) {
    // System.out.println(solution(10));
    System.out.println(solution2(5));
  }
}
