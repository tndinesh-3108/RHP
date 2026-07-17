import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();

    int[][] grid = new int[R][C];
    long[][] dp = new long[R][C];

    for (int row = 0; row < R; row++) {
      for (int col = 0; col < C; col++) {
        grid[row][col] = sc.nextInt();
        if (col == 0) {
          dp[row][col] = grid[row][col];
        }
      }
    }

    for (int col = 1; col < C; col++) {
      long[] maxes = getFSMax(dp, col - 1, R);
      long fmax = maxes[0];
      long smax = maxes[1];
      for (int row = 0; row < R; row++) {
        dp[row][col] = grid[row][col] + (dp[row][col - 1] == fmax ? smax : fmax);
      }
    }
    long answer = getFSMax(dp, C - 1, R)[0];
    System.out.println(answer);
  }
  private static long[] getFSMax(long[][] dp, int col, int R) {
    long fmax = Long.MIN_VALUE;
    long smax = Long.MIN_VALUE;
    for (int row = 0; row < R; row++) {
      long curr = dp[row][col];
      if (curr > fmax) {
        smax = fmax;
        fmax = curr;
      } else if (curr > smax) {
        smax = curr;
      }
    }
    return new long[]{fmax, smax};
  }
}
