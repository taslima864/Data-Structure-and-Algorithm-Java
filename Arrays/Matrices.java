package Arrays;

import java.util.*;

public class Matrices {
  public static boolean search(int matrix[][], int key) {
    for (int i = 0; i < matrix[0].length; i++) {

      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("found at cell (" + i + "," + j + ")");
          return true;
        }

      }

    }
    System.err.println("key not found");
    return false;

  }

  public static void main(String[] args) {

    int matrix[][] = new int[3][3];

    int n = matrix.length;
    int m = matrix[0].length;

    Scanner sc = new Scanner(System.in);

    // INPUT
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < m; j++) {

        matrix[i][j] = sc.nextInt();
      }
    }

    // PRINT
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < m; j++) {

        System.out.print(matrix[i][j] + " ");
      }

      System.out.println();
    }
    search(matrix, 3);
    sc.close();
  }
}