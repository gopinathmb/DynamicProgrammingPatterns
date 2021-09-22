/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack;

/**
 * @author gopinath_mb
 */
public class ZeroOneKnapsackBUWithMemoization {

  public int knapsack(int wt[], int val[], int W, int n) {

    int t[][] = new int[n + 1][W + 1];
    for(int i = 0; i < n + 1; i++) {
      for(int j = 0; j < W + 1; j++) {
        if (i == 0 || j == 0) {
          t[i][j] = 0;
        } else {
          t[i][j] = -1;
        }
      }
    }

    int profit = knapsackWithMemoization(wt, val, W, n, t);

    for(int i = 0; i < n + 1; i++) {
      for(int j = 0; j < W + 1; j++) {
        System.out.print(t[i][j] + " ");
      }
      System.out.println();
    }

    return profit;

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
