/**
 * Created by gopinath_mb on Sep 29, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

/**
 * @author gopinath_mb
 */
public class MinimumSubsetSumDifference {

  public static int minSubSetSumDiff(int[] val) {
    int n = val.length;
    int sum = 0;
    for(int i = 0; i < val.length; i++) {
      sum += val[i];
    }
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for(int i = 0; i <= sum; i++) {
      dp[0][i] = false;
    }
    for(int i = 0; i <= n; i++) {
      dp[i][0] = true;
    }
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= sum; j++) {

        if (val[i - 1] <= j) {
          dp[i][j] = dp[i - 1][j - val[i - 1]] || dp[i - 1][j];
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }

    for(int i = sum / 2; i >= 0; i--) {
      if (dp[n][i] == true) {
        return Math.abs(i - (sum - i));
      }

    }

    return Integer.MAX_VALUE;
  }
}
