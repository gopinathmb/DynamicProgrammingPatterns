/**
 * Created by gopinath_mb on Sep 25, 2021
 */
package com.gopi.dp.lcs;

/**
 * @author gopinath_mb
 */
public class LargestCommonSubSequenceBottomUpWithMemoization {

  public static int lcs(String x, String y) {
    int m = (x == null ? 0 : x.length());
    int n = (y == null ? 0 : y.length());
    int dp[][] = new int[m + 1][n + 1];
    return lcsInternal(x, y, m, n, dp);

  }

  /**
   * @param x
   * @param y
   * @param m
   * @param n
   * @return
   */
  private static int lcsInternal(String x, String y, int m, int n, int dp[][]) {
    if (m == 0 || n == 0) {
      return 0;
    }
    if (dp[m][n] != -1) {
      return dp[m][n];
    }

    if (x.charAt(m - 1) == y.charAt(n - 1)) {
      dp[m][n] = (1 + lcsInternal(x, y, m - 1, n - 1, dp));
    } else {
      dp[m][n] = Math.max(lcsInternal(x, y, m - 1, n, dp), lcsInternal(x, y, m, n - 1, dp));
    }

    return dp[m][n];
  }

}
