package com.libutil.test.str;

import com.libutil.StrUtil;
import com.libutil.TestUtil;

public class IntNumToDecimalTest {

  public static void main(String args[]) {
    test(1, 0, "1");
    test(1, 1, "0.1");
    test(1, 2, "0.01");
    test(1, 3, "0.001");

    test(123, 0, "123");
    test(123, 1, "12.3");
    test(123, 2, "1.23");
    test(123, 3, "0.123");

    test(1000, 0, "1000");
    test(1000, 1, "100.0");
    test(1000, 2, "10.00");
    test(1000, 3, "1.000");
  }

  private static void test(long number, int scale, String expect) {
    TestUtil.assertEquals(expect, StrUtil.intNumToDecimal(number, scale));
  }

}
