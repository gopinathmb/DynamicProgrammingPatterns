/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

import com.gopi.dp.util.DPUtil;

/**
 * @author gopinath_mb
 */
public class SubSetSumTopDown {

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

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= sum; j++) {

        if (val[i - 1] <= j) {
          dp[i][j] = (dp[i - 1][j - val[i - 1]] || dp[i - 1][j]);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    DPUtil.printMatrix(dp);

    return dp[n][sum];

  }

}
