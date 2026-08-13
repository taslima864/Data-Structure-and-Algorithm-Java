package Bit_Manipulation;

public class SwapNum {
  public static void solution(int x, int y) {
    System.out.println("Before swap: x = " + x + " and y = " + y);
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println("After swap: x = " + x + " and y = " + y);
  }

  public static void solution2(int x) {
    System.out.println(x + " + " + 1 + " is " + -~x);
  }

  public static void main(String[] args) {
    // solution(3, 4);
    solution2(6);
  }
}
