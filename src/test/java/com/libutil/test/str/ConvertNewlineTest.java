package com.libutil.test.str;

import com.libutil.StrUtil;
import com.libutil.test.Log;

public class ConvertNewlineTest {

  public static void main(String args[]) {
    String str = " abc\n123 456\r\nxyz\rABC\tDEF ";
    Log.d("\"" + str + "\"");
    test(str, "#");
    test(str, "<br>");
    test(str, "\\\\");
    test(str, "\\$");
  }

  private static void test(String str, String newline) {
    Log.d("\"" + StrUtil.convertNewLine(str, newline) + "\"");
  }

}
