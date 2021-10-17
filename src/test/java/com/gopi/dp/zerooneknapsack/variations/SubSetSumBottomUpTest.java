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
public class SubSetSumBottomUpTest {

  @Test
  public void testSubsetSumBottomUP1() {
    int[] vaues = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUp.subSetSum(vaues, vaues.length, 9));
  }

  @Test
  public void testSubsetSumBottomUP2() {
    int[] vaues = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUp.subSetSum(vaues, vaues.length, 10));
  }

  @Test
  public void testSubsetSumBottomUP3() {
    int[] vaues = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUp.subSetSum(vaues, vaues.length, 6));
  }

  @Test
  public void testSubsetSumBottomUP4() {
    int[] vaues = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUp.subSetSum(vaues, vaues.length, 8));
  }

  @Test
  public void testSubsetSumBottomUP5() {
    int[] vaues = { 2, 5, 7, 8, 1 };
    assertTrue(SubSetSumBottomUp.subSetSum(vaues, vaues.length, 23));
  }

  @Test
  public void testSubsetSumBottomUP6() {
    int[] vaues = { 2, 5, 7, 8, 1 };
    assertFalse(SubSetSumBottomUp.subSetSum(vaues, vaues.length, 19));
  }

}
