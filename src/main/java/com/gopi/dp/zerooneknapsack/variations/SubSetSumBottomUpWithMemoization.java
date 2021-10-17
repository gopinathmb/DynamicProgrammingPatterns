/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

import com.gopi.dp.util.DPUtil;

/**
 * @author gopinath_mb
 */
public class SubSetSumBottomUpWithMemoization {

  public static boolean subSetSum(int[] val, int sum) {

    int n = val.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for(int i = 0; i <= sum; i++) {
      dp[0][i] = false;
    }
    // it also overrides dp[0][0] which is expected
    for(int i = 0; i <= n; i++) {
      dp[i][0] = true;
    }

    boolean doSubsetExists = subSetSumWithMemoization(val, n, sum, dp);
    DPUtil.printMatrix(dp);

    return doSubsetExists;

  }

  public static boolean subSetSumWithMemoization(int[] val, int n, int sum, boolean[][] dp) {
    if(sum==0)
    {
      return true;
    }
    if(n==0)
    {
      return false;
    }
    if (val[n - 1] <= sum) {
      dp[n][sum]=(subSetSumWithMemoization(val, n - 1, sum - val[n - 1], dp)
          || subSetSumWithMemoization(val, n - 1, sum, dp));
    } else {
      dp[n][sum]= subSetSumWithMemoization(val, n - 1, sum, dp);
    }
    
    return dp[n][sum];
  }
}
