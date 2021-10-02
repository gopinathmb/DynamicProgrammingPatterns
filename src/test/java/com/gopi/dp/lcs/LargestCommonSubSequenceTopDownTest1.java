/**
 * Created by gopinath_mb on Oct 2, 2021
 */
package com.gopi.dp.lcs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class LargestCommonSubSequenceTopDownTest1 {

  @Test
  public void testLargestCommonSubSequenceTopDown1() {

    Assert.assertEquals(0, LargestCommonSubSequenceTopDown.lcs("", ""));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown2() {

    Assert.assertEquals(0, LargestCommonSubSequenceTopDown.lcs(null, "cmnexf"));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown3() {

    Assert.assertEquals(3, LargestCommonSubSequenceTopDown.lcs("abcdef", "cmnexf"));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown4() {

    Assert.assertEquals(0, LargestCommonSubSequenceTopDown.lcs("abc", "xyz"));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown5() {

    Assert.assertEquals(1, LargestCommonSubSequenceTopDown.lcs("abc", "cba"));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown6() {

    Assert.assertEquals(4, LargestCommonSubSequenceTopDown.lcs("axyb", "axyb"));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown7() {

    Assert.assertEquals(4, LargestCommonSubSequenceTopDown.lcs("axyb", "axybmnop"));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown8() {

    Assert.assertEquals(3, LargestCommonSubSequenceTopDown.lcs("aaa", "ababa"));
  }

  @Test
  public void testLargestCommonSubSequenceTopDown9() {

    Assert.assertEquals(1, LargestCommonSubSequenceTopDown.lcs("aaaa", "bbbabbb"));
  }

}
