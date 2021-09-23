/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

/**
 * @author gopinath_mb
 */
public class SubSetSumBottomUp {

  public static boolean subSetSum(int[] val, int n, int sum) {
    if (sum == 0) {
      return true;
    }
    if (n == 0) {
      return false;
    }

    if (val[n - 1] <= sum) {
      return (subSetSum(val, n - 1, sum - val[n - 1]) || subSetSum(val, n-1, sum));
    } else {
      return (subSetSum(val, n - 1, sum));
    }
  }
}
