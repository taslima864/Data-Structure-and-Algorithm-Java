package Patterns;

import java.util.Scanner;

public class Pattern8 {
  public static void solution(int n) {
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println("");
    }

    // inverted
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println("");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    int n = sc.nextInt();
    solution(n);
  }
}
