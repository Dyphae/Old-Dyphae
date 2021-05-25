package com.github.MASTRIO.Dyphae.Commands;

public class CommandBuilder {

  // * Commands
  // Command: Say
  public static String say(String message) {

    return new Command("say " + message).add();

  }

  // Command: Give
  public static String give(String selector, String item, int amount) {

    return new Command("give " + selector + " " + item + " " + amount).add();

  }
  public static String give(String selector, String item, String nbt, int amount) {

    return new Command("give " + selector + " " + item + "{" + nbt + "} " + amount).add();

  }

}
