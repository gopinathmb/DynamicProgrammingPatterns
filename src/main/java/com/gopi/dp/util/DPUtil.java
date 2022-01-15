/**
 * Created by gopinath_mb on Sep 22, 2021
 */
package com.gopi.dp.util;

/**
 * @author gopinath_mb
 */
public class DPUtil {
// This will print matrix.
  public static void printMatrix(int[][] t) {
    System.err.println("---------------START----------------------");
    for(int i = 0; i < t.length; i++) {
      for(int j = 0; j < t[i].length; j++) {

        System.out.print(String.format("%4d", t[i][j]));
      }
      System.out.println();
    }
    System.err.println("---------------END----------------------");

  }

  public static void printMatrix(boolean[][] t) {
    System.err.println("---------------START----------------------");
    for(int i = 0; i < t.length; i++) {
      for(int j = 0; j < t[i].length; j++) {

        System.out.print(String.format("%-7b", t[i][j]));
      }
      System.out.println();
    }
    System.err.println("---------------END----------------------");

  }
}
