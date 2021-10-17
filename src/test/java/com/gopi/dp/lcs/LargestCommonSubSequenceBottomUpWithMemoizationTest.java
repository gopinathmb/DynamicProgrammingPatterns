/**
 * Created by gopinath_mb on Oct 2, 2021
 */
package com.gopi.dp.lcs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class LargestCommonSubSequenceBottomUpWithMemoizationTest {

  @Test
  public void testLargestCommonSubSequenceBottomUp1() {

    Assert.assertEquals(0, LargestCommonSubSequenceBottomUpWithMemoization.lcs("", ""));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest2() {

    Assert.assertEquals(0, LargestCommonSubSequenceBottomUpWithMemoization.lcs(null, "cmnexf"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest3() {

    Assert.assertEquals(3, LargestCommonSubSequenceBottomUpWithMemoization.lcs("abcdef", "cmnexf"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest4() {

    Assert.assertEquals(0, LargestCommonSubSequenceBottomUpWithMemoization.lcs("abc", "xyz"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest5() {

    Assert.assertEquals(1, LargestCommonSubSequenceBottomUpWithMemoization.lcs("abc", "cba"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest6() {

    Assert.assertEquals(4, LargestCommonSubSequenceBottomUpWithMemoization.lcs("axyb", "axyb"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest7() {

    Assert.assertEquals(4, LargestCommonSubSequenceBottomUpWithMemoization.lcs("axyb", "axybmnop"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest8() {

    Assert.assertEquals(3, LargestCommonSubSequenceBottomUpWithMemoization.lcs("aaa", "ababa"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUpWithMemoizationTest9() {

    Assert.assertEquals(1, LargestCommonSubSequenceBottomUpWithMemoization.lcs("aaaa", "bbbabbb"));
  }

}
