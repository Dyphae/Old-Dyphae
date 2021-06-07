package com.github.MASTRIO.Dyphae;

import com.github.MASTRIO.Dyphae.Core.Datapack;
import com.github.MASTRIO.Dyphae.Builders.Selector;

public class Command {

  // * Commands
  // Command: Function
  public static String function(String namespace, String function) {

    if (namespace == "this") {

      namespace = Datapack.datapackName;

    }

    return "function " + namespace + ":" + function;

  }

  // Command: Say
  public static String say(String message) {

    return "say " + message;

  }

  // Command: Give
  public static String give(Selector selector, String item, int amount) {

    return "give " + selector.get() + " " + item + " " + amount;

  }
  public static String give(Selector selector, String item, String nbt, int amount) {

    return "give " + selector.get() + " " + item + "{" + nbt + "} " + amount;

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
