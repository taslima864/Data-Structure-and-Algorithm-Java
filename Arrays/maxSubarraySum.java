package Arrays;

public class maxSubarraySum {

  public static void MaxSubarraySum(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    // Step 1: create prefix array
    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      prefix[i] = prefix[i - 1] + numbers[i];
    }

    // Step 2: use prefix to calculate subarray sums
    for (int i = 0; i < numbers.length; i++) {
      int start = i;

      for (int j = i; j < numbers.length; j++) {
        int end = j;

        if (start == 0) {
          currSum = prefix[end];
        } else {
          currSum = prefix[end] - prefix[start - 1];
        }

        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
    }

    System.out.println("max sum = " + maxSum);
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    MaxSubarraySum(numbers);
  }
}