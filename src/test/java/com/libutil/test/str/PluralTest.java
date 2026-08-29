package com.libutil.test.str;

import com.libutil.StrUtil;
import com.libutil.test.Log;

public class PluralTest {

  public static void main(String args[]) {
    test("apple");
    test("APPLE");
    test("bus");
    test("city");
    test("CITY");
    test("city", true);
    test("dish");
    test("key");
    test("KEY");
    test("piano");
    test("potato");
  }

  private static void test(String word) {
    Log.i(word + "(1)=" + StrUtil.plural(word, 1));
    Log.i(word + "(0)=" + StrUtil.plural(word, 0));
    Log.i(word + "(2)=" + StrUtil.plural(word, 2));
    Log.i(word + "(-1)=" + StrUtil.plural(word, -1));
  }

  private static void test(String word, boolean flag) {
    Log.i(word + "(1)=" + StrUtil.plural(word, 1, flag));
    Log.i(word + "(0)=" + StrUtil.plural(word, 0, flag));
    Log.i(word + "(2)=" + StrUtil.plural(word, 2, flag));
    Log.i(word + "(-1)=" + StrUtil.plural(word, -1, flag));
  }

}
