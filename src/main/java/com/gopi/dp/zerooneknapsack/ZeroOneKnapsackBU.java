/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack;

/**
 * @author gopinath_mb
 */
public class ZeroOneKnapsackBU {

  public int knapsack(int wt[], int val[], int W, int n) {
    if (n == 0 || W == 0) {
      return 0;
    }

    if (wt[n - 1] < W) {
      return Math.max(val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1),
          knapsack(wt, val, W, n - 1));
    } else {
      return knapsack(wt, val, W, n - 1);
    }

  }

}
