package Patterns;

import java.util.Scanner;

public class Pattern16 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();
    sc.close();

    for (int i = 0; i <= n; i++) {

      for (int j = 0; j <= n * i - 2; j++) {

        System.out.print(" * ");
      }
      for (int j = i; j > n; j--) {
        System.out.print(" ");
      }

      System.out.println();
    }
  }

}
