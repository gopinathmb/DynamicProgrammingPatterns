/**
 * Created by gopinath_mb on Sep 25, 2021
 */
package com.gopi.dp.lcs;

/**
 * @author gopinath_mb
 */
public class LargestCommonSubSequenceBottomUp {

  public static int lcs(String x, String y) {
    int m = (x == null ? 0 : x.length());
    int n = (y == null ? 0 : y.length());
    return lcsInternal(x, y, m, n);

  }


  //This is basic pattern so know more about it
  private static int lcsInternal(String x, String y, int m, int n) {
    if (m == 0 || n == 0) {
      return 0;
    }
    if (x.charAt(m - 1) == y.charAt(n - 1)) {
      return (1 + lcsInternal(x, y, m - 1, n - 1));
    } else {
      return Math.max(lcsInternal(x, y, m - 1, n), lcsInternal(x, y, m, n - 1));
    }
  }

}
