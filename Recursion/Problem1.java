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

  public static void main(String[] args) {
    int n = 10;
    solution(n);
  }
}
