package Arrays;

public class SortedMatrix {

  public static boolean searchKey(int matrix[][], int key) {

    // Start from Bottom-Left
    int row = matrix.length - 1;
    int col = 0;

    while (row >= 0 && col < matrix[0].length) {

      if (matrix[row][col] == key) {
        System.out.println("Found key at (" + row + "," + col + ")");
        return true;
      }

      // Key is smaller → Move UP
      else if (key < matrix[row][col]) {
        row--;
      }

      // Key is bigger → Move RIGHT
      else {
        col++;
      }
    }

    System.out.println("Key not found");
    return false;
  }

  public static void main(String[] args) {

    int matrix[][] = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 }
    };

    int key = 33;

    System.out.println(searchKey(matrix, key));
  }
}