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
public class SubSetEqualSumTest {

  @Test
  public void testSubSetSumTopDown1() {
    int[] values = { 2, 5, 7, 8, 1, 1 };
    assertTrue(SubSetEqualSum.subSetEqualSum(values));
  }

  @Test
  public void testSubSetSumTopDown2() {
    int[] values = { 1, 5, 7, 1 };
    assertTrue(SubSetEqualSum.subSetEqualSum(values));
  }

  @Test
  public void testSubSetSumTopDown3() {
    int[] values = { 1, 1, 1, 1, 1, 1 };
    assertTrue(SubSetEqualSum.subSetEqualSum(values));
  }

  @Test
  public void testSubSetSumTopDown4() {
    int[] values = { 10, 2, 3, 3, 2 };
    assertTrue(SubSetEqualSum.subSetEqualSum(values));
  }

  @Test
  public void testSubSetSumTopDown5() {
    int[] values = {};
    assertTrue(SubSetEqualSum.subSetEqualSum(values));
  }

  @Test
  public void testSubSetSumTopDown6() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertFalse(SubSetEqualSum.subSetEqualSum(values));
  }

  @Test
  public void testSubSetSumTopDown7() {
    int[] values = { 3, 3, 4, 4, 1 };
    assertFalse(SubSetEqualSum.subSetEqualSum(values));
  }

  @Test
  public void testSubSetSumTopDown8() {
    int[] values = { 5 };
    assertFalse(SubSetEqualSum.subSetEqualSum(values));
  }

}
