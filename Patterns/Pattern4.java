package Patterns;

import java.util.*;

public class Pattern4 {
  public static void solution(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println(" ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num of row:");
    int n = sc.nextInt();
    solution(n);
    sc.close();

  }
}
