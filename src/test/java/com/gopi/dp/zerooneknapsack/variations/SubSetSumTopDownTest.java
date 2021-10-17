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
public class SubSetSumTopDownTest {

  @Test
  public void testSubSetSumTopDown1() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumTopDown.subSetSum(values, 9));
  }

  @Test
  public void testSubSetSumTopDown2() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumTopDown.subSetSum(values, 10));
  }

  @Test
  public void testSubSetSumTopDown3() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumTopDown.subSetSum(values, 6));
  }

  @Test
  public void testSubSetSumTopDown4() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumTopDown.subSetSum(values, 8));
  }

  @Test
  public void testSubSetSumTopDown5() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumTopDown.subSetSum(values, 23));
  }

  @Test
  public void testSubSetSumTopDown6() {
    int[] values = { 2, 5, 7, 8, 1 };
    assertFalse(SubSetSumTopDown.subSetSum(values, 19));
  }

}
