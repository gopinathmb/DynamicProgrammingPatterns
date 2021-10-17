/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack;

import com.gopi.dp.util.DPUtil;

/**
 * @author gopinath_mb
 */
public class ZeroOneKnapsackBUWithMemoization {

  public int knapsack(int wt[], int val[], int W, int n) {

    int t[][] = new int[n + 1][W + 1];// so that we can store value n and W in
                                      // matrice and matrice start from zero
    initialization(W, n, t);

    int profit = knapsackWithMemoization(wt, val, W, n, t);

    DPUtil.printMatrix(t);
    return profit;

  }

  /**
   * Fill base condition condition and initialize rest with -1 to indicate that
   * it is not yet solved.
   * 
   * @param W
   * @param n
   * @param t
   */
  private void initialization(int W, int n, int[][] t) {
    for(int i = 0; i < n + 1; i++) {
      for(int j = 0; j < W + 1; j++) {
        if (i == 0 || j == 0) {
          t[i][j] = 0;
        } else {
          t[i][j] = -1;
        }
      }
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
