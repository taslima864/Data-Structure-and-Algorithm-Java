package Bit_Manipulation;

public class BitMask {
  // get ith Bit
  public static int solution(int n, int i) {
    int bitMask = 1 << i;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  // set ith Bit
  public static int solution2(int n, int i) {
    int bitMask = 1 << i;
    return (n | bitMask);
  }

  // clear ith bit
  public static int solution3(int n, int i) {
    int bitMask = ~(1 << i);
    return n & bitMask;
  }

  // Update ith bit
  public static int solution4(int n, int i, int newBit) {
    int BitMask = newBit << i;
    return n | BitMask;
  }

  // clear last i bits
  public static int solution5(int n, int i) {
    int bitMask = (~0) << i;
    return n & bitMask;

  }

  public static void main(String args[]) {
    // System.out.print(solution(13, 1));
    // System.out.println(solution2(10, 2));
    // System.out.println(solution3(10, 1));
    // System.out.println(solution4(13, 2, 1));
    System.out.println(solution5(15, 2));

  }
}
