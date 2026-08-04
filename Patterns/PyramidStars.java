package Patterns;

import java.util.Scanner;

public class PyramidStars {
  public static void solution(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    int n = sc.nextInt();
    solution(n);
    sc.close();

  }
}