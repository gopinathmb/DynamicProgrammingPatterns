/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack;

import com.gopi.dp.util.DPUtil;

/**
 * @author gopinath_mb
 */
public class ZeroOneKnapsackTopDown {

  public int knapsack(int wt[], int val[], int W, int n) {

    int t[][] = new int[n + 1][W + 1];
    // just replace n with i and W with j. Just refer BottomUp and deduct
    // TopDown.
    initialization(W, n, t);

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= W; j++) {

        if (wt[i - 1] <= j) {
          t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
        } else {
          t[i][j] = t[i - 1][j];
        }
      }
    }
    DPUtil.printMatrix(t);
    return t[n][W];

  }

  /**
   * @param W
   * @param n
   * @param t
   */
  private void initialization(int W, int n, int[][] t) {
    for(int i = 0; i <= n; i++) {
      t[i][0] = 0;
    }

    for(int j = 0; j <= W; j++) {
      t[0][j] = 0;
    }
  }

  /**
   * @param wt
   * @param val
   * @param W
   * @param n
   * @param class1
   * @return
   */
  private int knapsackWithMemoization(int[] wt, int[] val, int W, int n, int t[][]) {
    if (n == 0 || W == 0) {
      return 0;
    }
    // Memoization
    if (t[n][W] != -1) {
      return t[n][W];
    }

    if (wt[n - 1] <= W) {
      t[n][W] = Math.max(val[n - 1] + knapsackWithMemoization(wt, val, W - wt[n - 1], n - 1, t),
          knapsackWithMemoization(wt, val, W, n - 1, t));
    } else {
      t[n][W] = knapsackWithMemoization(wt, val, W, n - 1, t);
    }

    return t[n][W];
  }

}
