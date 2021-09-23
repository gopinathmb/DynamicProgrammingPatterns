/**
 * Created by gopinath_mb on Sep 23, 2021
 */
package com.gopi.dp.zerooneknapsack.variations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class SubSetCountTest {

  @Test
  public void testSubSetSumCount1() {
    int[] values = { 2, 5, 7, 8, 1, 1 };
    assertEquals(2, SubSetCount.subsetCount(values, 1));
  }

  @Test
  public void testSubSetSumCount2() {
    int[] values = { 2, 5, 7, 8, 1, 1 };
    assertEquals(3, SubSetCount.subsetCount(values, 7));
  }

  @Test
  public void testSubSetSumCount3() {
    int[] values = { 2, 5, 7, 8, 1, 1 };
    assertEquals(2, SubSetCount.subsetCount(values, 23));
  }

  @Test
  public void testSubSetSumCount4() {
    int[] values = { 3, 7, 9 };
    assertEquals(1, SubSetCount.subsetCount(values, 9));
  }

  // Important :when duplicates consider each one as unique
  @Test
  public void testSubSetSumCount5() {
    int[] values = { 1, 1, 1, 1 };
    assertEquals(6, SubSetCount.subsetCount(values, 2));
  }

}
