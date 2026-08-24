package Recursion;

public class TowerOfHanoi {
  public static void towerOfHanoi(int n, String src, String helper, String dest) {

    // Base Case
    if (n == 1) {
      System.out.println("Transfer disk 1 from " + src + " to " + dest);
      return;
    }

    // Step 1: n-1 disks ko source se helper par le jao
    towerOfHanoi(n - 1, src, dest, helper);

    // Step 2: largest disk ko source se destination par le jao
    System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

    // Step 3: n-1 disks ko helper se destination par le jao
    towerOfHanoi(n - 1, helper, src, dest);
  }

  public static void main(String[] args) {

    int n = 3;

    towerOfHanoi(n, "S", "H", "D");
  }
}
