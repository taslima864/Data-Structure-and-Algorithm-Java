package Bit_Manipulation;

public class FastExpo {
  public static int solution(int a, int n) {
    int ans = 1;
    while (n > 0) {
      if ((n & 1) != 0) { // check lsb
        ans = ans * a;
      }
      a = a * a;
      n = n >> 1;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(solution(3, 5));
  }
}