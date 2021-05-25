package com.github.MASTRIO.JADF;

public class CommandBuilder {

  // * Commands
  // Command: Say
  public static Command say(String message) {

    return new Command("say " + message);

  }

  // Command: Give
  public static Command give(String selector, String item, int amount) {

    return new Command( ("give " + selector + " " + item + " " + amount)).add();

  }
  public static Command give(String selector, String item, String nbt, int amount) {

    return new Command("give " + selector + " " + item + "{" + nbt + "} " + amount).add();

  }

}
