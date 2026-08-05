package Patterns;

import java.util.Scanner;

public class Pattern13 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();
    sc.close();

    for (int i = 0; i < n; i++) {

      for (char ch = 'A'; ch <= 'A' + i; ch++) {
        System.out.print(ch);

      }

      System.out.println();
    }
  }

}
