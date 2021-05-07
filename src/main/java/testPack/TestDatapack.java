package testPack;

import com.github.MASTRIO.JADF.Build;
import com.github.MASTRIO.JADF.Commands;
import com.github.MASTRIO.JADF.Datapack;

public class TestDatapack {

  // Variables
  static Commands commands = new Commands();
  static Build build = new Build();

  // Main method
  public static void main(String[] args) {

    // Create new datapack
    Datapack.newDatapack(
      "Kinda Sus Datapack ngl",
      "hurr",
      "That's kinda sus",
      "Bob Ross",
      "version 'sus'"
    );

    // Load and Tick
    Datapack.loadFunction = new String[] {
      commands.say("loading pog"),
      commands.function("this", "coolFunction"),
      commands.gamerule("showDeathMessages", false),
      commands.title("@a", "clear", null)
    };
    Datapack.tickFunction = new String[]{
      commands.give("@a", "dirt", 1, null)
    };


    // Build the datapack
    build.baseFiles();
    /* --- |Functions| --- */
    coolFunction();
    someOtherFunction();
    sus();
    call();
    /* ------------------- */
    build.completeBuild();

  }

  // Functions
  static void coolFunction() {

    build.functionCommands = new String[] {
      commands.say("sus"),
      commands.say("egg"),
      commands.say("oh wow it's you!!!"),
      commands.give("@a", "oak_planks", 69, null),
      commands.tellraw("@r", "{\"text\":\"test tellraw message\"}")
    }; build.createFunction("coolFunction");

  }

  static void someOtherFunction() {

    build.functionCommands = new String[] {
      commands.say("hmm"),
      commands.say("hurr"),
      commands.say("test 3????"),
      commands.say("MORE TESTING WOO"),
      commands.help(),
      commands.title(null, "apple", null)
    }; build.createFunction("hey_look_a_cool_function");

  }

  static void sus() {

    build.functionCommands = new String[] {
      commands.say("That's kinda sus ngl"),
      commands.give("@r", "chorus_fruit", 1, "Count:69"),
      commands.clear("@r", "netherite_ingot", 34),
      commands.title("@a", "title", "bro that's kinda sus")
    }; build.createFunction("sus");

  }

  static void call() {

    build.functionCommands = new String[] {
      commands.say("emergency meeting"),
      commands.function("this", "sus")
    }; build.createFunction("call");

  }

}
