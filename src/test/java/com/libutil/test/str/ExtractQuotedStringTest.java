package com.libutil.test.str;

import com.libutil.StrUtil;
import com.libutil.test.Log;

public class ExtractQuotedStringTest {

  public static void main(String args[]) {
    test("\"abc\"", "\"");
    test("'abc'", "'");

    test("abc\"xyz\"", "\"");

    test("(abc)", "(", ")");

    test("", "\"");
    test(" ", "\"");
    test(null, "\"");
  }

  private static void test(String s, String q) {
    test(s, q, q);
  }

  private static void test(String s, String qS, String qE) {
    Log.i("----------");
    Log.i("src=[" + s + "]");
    Log.i(StrUtil.extractQuotedString(s, qS, qE));
  }

}
