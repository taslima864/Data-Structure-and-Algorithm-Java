package Patterns;

import java.util.Scanner;

public class Pattern15 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();
    sc.close();

    for (int i = 0; i < n; i++) {
        char ch = (char) ('A' + i);
        for (int j = 0; j <= i; j++) {
            System.out.print(ch);
        }

        System.out.println();
    }
  }

}
