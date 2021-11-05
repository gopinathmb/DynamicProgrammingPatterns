/**
 * Created by gopinath_mb on Oct 2, 2021
 */
package com.gopi.dp.lcs.variations;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
public class LargestCommonPalindromicSubStringTopDownTest {

  @Test
  public void testLongestCommonPalindromicSubstringTopDown1() {

    System.out.println(LongestCommonPalindromicSubstring.printLPS("babad"));
    System.out.println(LongestCommonPalindromicSubstring.printLPS("abbba"));
    System.out.println(LongestCommonPalindromicSubstring.printLPS("cbbd"));
    System.out.println(LongestCommonPalindromicSubstring.printLPS("aaaa"));
    System.out.println(LongestCommonPalindromicSubstring.printLPS("ababab"));
    System.out.println(LongestCommonPalindromicSubstring.printLPS(""));
    System.out.println(LongestCommonPalindromicSubstring.printLPS(null));
    System.out.println(LongestCommonPalindromicSubstring.printLPS("cbdfbd"));
    System.out.println(LongestCommonPalindromicSubstring.printLPS("aacabdkacaa"));
    System.out.println(LongestCommonPalindromicSubstring.printLPS("aaca"));
  }

}
