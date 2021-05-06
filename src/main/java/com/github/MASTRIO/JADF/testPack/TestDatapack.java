package com.github.MASTRIO.JADF.testPack;

import com.github.MASTRIO.JADF.Build;
import com.github.MASTRIO.JADF.Commands;
import com.github.MASTRIO.JADF.Datapack;

public class TestDatapack {

  // Variables
  static Datapack datapack = new Datapack();
  static Commands commands = new Commands();
  static Build build = new Build();

  // Main method
  public static void main(String[] args) {

    // Create new datapack
    datapack.newDatapack(
      "Kinda Sus Datapack ngl",
      "sus",
      "That's kinda sus",
      "I am bob ross",
      "v1.0.0"
    );

    // Build the datapack
    build.baseFiles();
    // Build Functions
    coolFunction();
    someOtherFunction();
    sus();
    build.completeBuild();

  }

  // Functions
  static void coolFunction() {

    build.functionCommands = new String[] {
      commands.say("sus"),
      commands.say("egg"),
      commands.say("oh wow it's you!!!"),
      commands.give("@a", "oak_planks", 69, null)
    };

    build.createFunction("coolFunction");

  }

  static void someOtherFunction() {

    build.functionCommands = new String[] {
      commands.say("hmm"),
      commands.say("hurr"),
      commands.say("test 3????"),
      commands.say("MORE TESTING WOO"),
      commands.help()
    };

    build.createFunction("hey_look_a_cool_function");

  }

  static void sus() {

    build.functionCommands = new String[] {
      commands.say("That's kinda sus ngl"),
      commands.give("@r", "chorus_fruit", 1, "Count:69"),
      commands.clear("@r", "netherite_ingot", 34)
    };

    build.createFunction("sus");

  }

}
