package com.github.MASTRIO.Dyphae.Console;

public class ConsoleLogger {

  // Log
  public static void log(String message) {

    System.out.println("[Dyphae@Log]: " + message);

  }

  // Warning
  public static void warning(String message) {

    System.out.println(ConsoleColours.WARNING + "[Dyphae@Warn]: " + message + ConsoleColours.RESET);

  }

  // Error
  public static void error(String message) {

    System.out.println(ConsoleColours.ERROR + "[Dyphae@Error]: " + message + ConsoleColours.RESET);

  }

  // Info
  public static void info(String message) {

    System.out.println(ConsoleColours.INFO + "[Dyphae@Info]: " + message + ConsoleColours.RESET);

  }

  // Success
  public static void success(String message) {

    System.out.println(ConsoleColours.SUCCESS + "[Dyphae@Success]: " + message + ConsoleColours.RESET);

  }

}
