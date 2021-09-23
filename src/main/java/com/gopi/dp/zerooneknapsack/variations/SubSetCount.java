/**
 * Created by gopinath_mb on Sep 23, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

/**
 * @author gopinath_mb
 */
public class SubSetCount {

  public static int subsetCount(int val[], int sum) {
    int n = val.length;

    int dp[][] = new int[n + 1][sum + 1];
    for(int i = 0; i <= sum; i++) {
      dp[0][i] = 0;
    }

    for(int i = 0; i <= n; i++) {
      dp[i][0] = 1;
    }

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= sum; j++) {
        if (val[i - 1] <= j) {
          dp[i][j] = dp[i - 1][j - val[i - 1]] + dp[i - 1][j];
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }

    return dp[n][sum];
  }

}
