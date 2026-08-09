package Bit_Manipulation;

public class BitMask {
  public static int solution(int n, int i) {
    int bitMask = 1 << i;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }

  }

  public static int solution2(int n, int i) {
    int bitMask = 1 << i;
    return (n | bitMask);
  }

  public static void main(String args[]) {
    // System.out.print(solution(13, 1));
    System.out.println(solution2(10, 2));

  }
}
