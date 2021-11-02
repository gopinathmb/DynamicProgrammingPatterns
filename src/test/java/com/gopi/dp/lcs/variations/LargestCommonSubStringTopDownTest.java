/**
 * Created by gopinath_mb on Oct 2, 2021
 */
package com.gopi.dp.lcs.variations;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class LargestCommonSubStringTopDownTest {

  @Test
  public void testLargestCommonSubSubstringTopDown1() {

    Assert.assertEquals(0, LargestCommonSubSubstringTopDown.lcs("", ""));
  }

  @Test
  public void testLargestCommonSubSubstringTopDown2() {

    Assert.assertEquals(0, LargestCommonSubSubstringTopDown.lcs(null, "cmnexf"));
  }

  @Test
  public void testLargestCommonSubSubstringTopDown3() {

//    Assert.assertEquals(3, LargestCommonSubSubstringTopDown.lcs("abcdef", "mabcfe"));
    LongestCommonPalindromicSubstring.printLPS("babad");
    
   
  }

  @Test
  public void testLargestCommonSubSubstringTopDown4() {

    Assert.assertEquals(1, LargestCommonSubSubstringTopDown.lcs("abc", "xzb"));
  }

  @Test
  public void testLargestCommonSubSubstringTopDown5() {

    Assert.assertEquals(1, LargestCommonSubSubstringTopDown.lcs("abc", "cba"));
  }

  @Test
  public void testLargestCommonSubSubstringTopDown6() {

    Assert.assertEquals(4, LargestCommonSubSubstringTopDown.lcs("axyb", "axyb"));
  }

  @Test
  public void testLargestCommonSubSubstringTopDown7() {

    Assert.assertEquals(4, LargestCommonSubSubstringTopDown.lcs("axyb", "axybmnop"));
  }

  @Test
  public void testLargestCommonSubSubstringTopDown8() {

    Assert.assertEquals(1, LargestCommonSubSubstringTopDown.lcs("aaa", "ababa"));
  }

  @Test
  public void testLargestCommonSubSubstringTopDown9() {

    Assert.assertEquals(1, LargestCommonSubSubstringTopDown.lcs("aaaa", "bbbabbb"));
  }

}
