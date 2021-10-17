/**
 * Created by gopinath_mb on Oct 2, 2021
 */
package com.gopi.dp.lcs;

/**
 * @author gopinath_mb
 */
public class LargestCommonSubSequenceTopDown {

  public static int lcs(String x, String y) {
    if (x == null || y == null || x.isEmpty() || y.isEmpty()) {
      return 0;
    }

    int m = x.length();
    int n = y.length();

    int[][] dp = new int[m+1][n+1];
    for(int i = 0; i <= m; i++) {
      dp[i][0] = 0;
    }
    for(int i = 0; i <= n; i++) {
      dp[0][i] = 0;
    }

    for(int i = 1; i <= m; i++) {
      for(int j = 1; j <= n; j++) {
        if (x.charAt(i - 1) == y.charAt(j - 1)) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[m][n];
  }
}
