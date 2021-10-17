/**
 * Created by gopinath_mb on Sep 23, 2021
 */
package com.gopi.dp.unboundedknapsack;

import com.gopi.dp.util.DPUtil;

/**
 * @author gopinath_mb
 */
public class UnBoundedKnapsack {

  public static int knapsack(int[] wt, int[] val, int sum) {
    int n = wt.length + 1;
    int[][] dp = new int[n + 1][sum + 1];

    for(int i = 0; i <= sum; i++) {
      dp[0][i] = 0;
    }

    for(int i = 0; i <= n; i++) {
      dp[i][0] = 1;
    }

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= sum; j++) {
        if (wt[i - 1] <= j) {
          dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }

    DPUtil.printMatrix(dp);

    return dp[n][sum];
  }

}
