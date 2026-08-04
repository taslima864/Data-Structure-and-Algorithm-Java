
import java.util.HashSet;

public class containsDuplicate {

  public static boolean arrayCC(int[] nums) {

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {

      // check duplicate
      if (set.contains(nums[i])) {
        return true;
      } else {
        set.add(nums[i]);
      }
    }

    return false;
  }

  public static void main(String[] args) {

    int[] nums = { 1, 2, 3, 3, 4, 5, 8, 8, 0 };

    System.out.println(arrayCC(nums));
  }
}