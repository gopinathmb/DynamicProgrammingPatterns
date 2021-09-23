/**
 * Created by gopinath_mb on Sep 23, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

/**
 * @author gopinath_mb
 */
public class SubSetEqualSum {

  public static boolean subSetEqualSum(int[] val) {
    int totalSum = 0;
    for(int i = 0; i < val.length; i++) {
      totalSum += val[i];
    }
    if (totalSum % 2 != 0) {
      return false;
    }

    return SubSetSumTopDown.subSetSum(val, totalSum / 2);
  }

}
