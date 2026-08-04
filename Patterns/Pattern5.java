package Patterns;

import java.util.*;

public class Pattern5 {
  public static void solution(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i + 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < n - i + 1; j++) {
        System.out.print(" ");
      }
      System.out.println("");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of row:");
    int n = sc.nextInt();
    solution(n);
    sc.close();
  }

}
