package com.libutil.test.util;

import com.libutil.CommandExecutor;
import com.libutil.test.Log;

public class CommandTest {
  private static final int LOOP = 1;

  public static void main(String args[]) {
    String[] command = { "cmd", "/c", "dir c:\\test" };
    execCommandTest(command);

    String[] command2 = { "cmd", "/c", "dir c:\\testa" };
    execCommandTest(command2);

    Log.d("------------------");
    execCommandTest2("dir c:\\test");
    execCommandTest2("dir c:\\testa");
  }

  private static void execCommandTest(String[] command) {
    for (int i = 0; i < LOOP; i++) {
      Log.d("loop=" + i);
      _execCommandTest(command);
    }
  }

  private static void _execCommandTest(String[] command) {
    CommandExecutor executor = new CommandExecutor();
    try {
      String result = executor.execCommand(command);
      Log.d(result);

      int exitStatus = executor.getExitStatus();
      Log.d("exit=" + exitStatus);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void execCommandTest2(String command) {
    try {
      String result = CommandExecutor.execWindowsCommand(command);
      Log.d(result);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
