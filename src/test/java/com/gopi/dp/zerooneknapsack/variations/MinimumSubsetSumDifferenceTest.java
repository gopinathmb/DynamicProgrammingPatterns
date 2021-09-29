/**
 * Created by gopinath_mb on Sep 29, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class MinimumSubsetSumDifferenceTest {

  @Test
  public void testMinimumSubsetSumDifference1() {
    int[] values = { 2, 2 };
    assertEquals(0, MinimumSubsetSumDifference.minSubSetSumDiff(values));
  }

  @Test
  public void testMinimumSubsetSumDifference2() {
    int[] values = { 2, 3 };
    assertEquals(1, MinimumSubsetSumDifference.minSubSetSumDiff(values));
  }

  @Test
  public void testMinimumSubsetSumDifference3() {
    int[] values = { 2, 3, 1 };
    assertEquals(0, MinimumSubsetSumDifference.minSubSetSumDiff(values));
  }

  @Test
  public void testMinimumSubsetSumDifference4() {
    int[] values = { 2, 3, 1, 5, 7, 9 };
    assertEquals(1, MinimumSubsetSumDifference.minSubSetSumDiff(values));
  }

  @Test
  public void testMinimumSubsetSumDifference5() {
    int[] values = { 7, 9, 13, 16 };
    assertEquals(1, MinimumSubsetSumDifference.minSubSetSumDiff(values));
  }

}
