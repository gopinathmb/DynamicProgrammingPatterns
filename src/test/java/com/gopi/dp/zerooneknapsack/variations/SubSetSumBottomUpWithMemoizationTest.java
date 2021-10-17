/**
 * Created by gopinath_mb on Sep 23, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class SubSetSumBottomUpWithMemoizationTest {

  @Test
  public void testSubSetSumBottomUpWithMemoization1() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUpWithMemoization.subSetSum(values, 9));
  }

  @Test
  public void testSubSetSumBottomUpWithMemoization2() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUpWithMemoization.subSetSum(values, 10));
  }

  @Test
  public void testSubSetSumBottomUpWithMemoization3() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUpWithMemoization.subSetSum(values, 6));
  }

  @Test
  public void testSubSetSumBottomUpWithMemoization4() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUpWithMemoization.subSetSum(values, 8));
  }

  @Test
  public void testSubSetSumBottomUpWithMemoization5() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUpWithMemoization.subSetSum(values, 23));
  }

  @Test
  public void testSubSetSumBottomUpWithMemoization6() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertFalse(SubSetSumBottomUpWithMemoization.subSetSum(values, 19));
  }

}
