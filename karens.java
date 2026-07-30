import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int[] diff = new int[200002];
    for (int i = 0; i < n; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      diff[l]++;
      diff[r + 1]--;
    }
    int[] good = new int[200002];
    int count = 0;
    for (int i = 1; i <= 200000; i++) {
      count += diff[i];
      if (count >= k) {
        good[i] = 1;
      }
    }
    for (int i = 1; i <= 200000; i++) {
      good[i] += good[i - 1];
    }
    StringBuilder ans = new StringBuilder();
    while (q-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      ans.append(good[b] - good[a - 1]).append('\n');
    }
    System.out.print(ans);
  }
}
