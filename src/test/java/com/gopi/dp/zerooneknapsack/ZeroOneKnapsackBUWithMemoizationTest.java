/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.zerooneknapsack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class ZeroOneKnapsackBUWithMemoizationTest {

  ZeroOneKnapsackBUWithMemoization knapsack;

  @Before
  public void initialize() {
    knapsack = new ZeroOneKnapsackBUWithMemoization();
  }

  @Test
  public void testZerooneKnapsack() throws Exception {
    int wt[] = { 1, 2, 4, 5, 6 };
    int val[] = { 3, 2, 5, 7, 2 };
    int profit = knapsack.knapsack(wt, val, 7, wt.length);
    Assert.assertEquals(10, profit);
  }

  @Test
  public void testZerooneKnapsack2() throws Exception {
    int wt[] = { 1, 2, 4, 5, 6 };
    int val[] = { 3, 2, 5, 7, 2 };
    int profit = knapsack.knapsack(wt, val, 9, wt.length);
    Assert.assertEquals(12, profit);
  }

}
