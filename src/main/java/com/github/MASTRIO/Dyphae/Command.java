package com.github.MASTRIO.Dyphae;

public class Command {

  // Variables

  // * Commands
  // Command: Say
  public static String say(String message) {

    return "say " + message;

  }

  // Command: Give
  public static String give(String selector, String item, int amount) {

    return "give " + selector + " " + item + " " + amount;

  }
  public static String give(String selector, String item, String nbt, int amount) {

    return "give " + selector + " " + item + "{" + nbt + "} " + amount;

  }

  // Command: Seed
  public static String seed() {

    return "seed";

  }

  // Command: Reload
  public static String reload() {

    return "reload";

  }

}
