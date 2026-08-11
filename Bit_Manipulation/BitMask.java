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

  // clear range of bits
  public static int solution6(int n, int i, int j) {
    int a = ((~0) << (j + 1));
    int b = (1 << i) - 1;
    int bitMask = a | b;
    return n & bitMask;

  }

  // check if Power of Two
  public static boolean solution7(int n) {
    return (n & (n - 1)) == 0;
  }

  public static void main(String args[]) {
    // System.out.print(solution(13, 1));
    // System.out.println(solution2(10, 2));
    // System.out.println(solution3(10, 1));
    // System.out.println(solution4(13, 2, 1));
    // System.out.println(solution5(15, 2));
    // System.out.println(solution6(10, 2, 4));
    System.out.println(solution7(12));

  }
}
