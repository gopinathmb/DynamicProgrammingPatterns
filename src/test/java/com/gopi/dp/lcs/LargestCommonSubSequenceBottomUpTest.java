/**
 * Created by gopinath_mb on Oct 2, 2021
 */
package com.gopi.dp.lcs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class LargestCommonSubSequenceBottomUpTest {

  @Test
  public void testLargestCommonSubSequenceBottomUp1() {

    Assert.assertEquals(0, LargestCommonSubSequenceBottomUp.lcs("", ""));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp2() {

    Assert.assertEquals(0, LargestCommonSubSequenceBottomUp.lcs(null, "cmnexf"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp3() {

    Assert.assertEquals(3, LargestCommonSubSequenceBottomUp.lcs("abcdef", "cmnexf"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp4() {

    Assert.assertEquals(0, LargestCommonSubSequenceBottomUp.lcs("abc", "xyz"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp5() {

    Assert.assertEquals(1, LargestCommonSubSequenceBottomUp.lcs("abc", "cba"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp6() {

    Assert.assertEquals(4, LargestCommonSubSequenceBottomUp.lcs("axyb", "axyb"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp7() {

    Assert.assertEquals(4, LargestCommonSubSequenceBottomUp.lcs("axyb", "axybmnop"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp8() {

    Assert.assertEquals(3, LargestCommonSubSequenceBottomUp.lcs("aaa", "ababa"));
  }

  @Test
  public void testLargestCommonSubSequenceBottomUp9() {

    Assert.assertEquals(1, LargestCommonSubSequenceBottomUp.lcs("aaaa", "bbbabbb"));
  }

}
