package Patterns;

import java.util.Scanner;

public class Pattern12 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();
    sc.close();

    int num = 1;
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num = num + 1;

      }

      System.out.println();
    }
  }

}
