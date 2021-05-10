package testPack;

import com.github.MASTRIO.JADF.Build;
import com.github.MASTRIO.JADF.Commands;
import com.github.MASTRIO.JADF.Datapack;

import java.io.IOException;

public class TestDatapack {

  // Variables
  static Commands commands = new Commands();
  static Build build = new Build();

  // Main method
  public static void main(String[] args) throws IOException {

    // Create new datapack
    Datapack.newDatapack(
      "Kinda Sus Datapack ngl",
      "hurr",
      "That's kinda sus",
      "Bob Ross",
      "bob_ross",
      "version 'sus'"
    );
    Datapack.config(
      true
    );

    // Load and Tick
    Datapack.loadFunction = new String[] {
      commands.say("loading pog"),
      commands.function("this", "cool_function"),
      Datapack.comment("sussy comment imposter"),
      commands.gamerule("showDeathMessages", false),
      commands.function("this", "gogy/dream")
    };
    Datapack.tickFunction = new String[]{
      commands.give("@a", "dirt", 1, null),
      commands.title("@e", "actionbar", null)
    };


    // Build the datapack
    build.baseFiles();
    /* --- |Sub-Folders| --- */
    Datapack.makeSubFolder("gogy");
    /* ---- |Functions| ---- */
    coolFunction();
    someOtherFunction();
    sus();
    call();
    dream();
    taggy();
    /* --------------------- */
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
    }; build.createFunction("cool_function");

  }

  static void someOtherFunction() {

    build.functionCommands = new String[] {
      commands.say("hmm"),
      commands.say("hurr"),
      commands.say("test 3????"),
      commands.say("MORE TESTING WOO"),
      commands.title(null, "apple", null)
    }; build.createFunction("hey_look");

  }

  static void sus() {

    build.functionCommands = new String[] {
      commands.say("That's kinda sus ngl"),
      commands.give("@a", "chorus_fruit", 1, "Count:69"),
      commands.title("@a", "title", "bro that's kinda sus")
    }; build.createFunction("sus");

  }

  static void call() {

    build.functionCommands = new String[] {
      commands.say("emergency meeting"),
      commands.function("this", "sus")
    }; build.createFunction("call");

  }

  static void dream() {

    build.functionCommands = new String[] {
      Datapack.comment("dodododo"),
      commands.title("@a", "title", "SPEEDRUN GOGOGOGO"),
      commands.title("@e", "actionbar", null)
    }; build.createFunction("gogy/dream");

  }

  static void taggy() {

    build.functionCommands = new String[] {
      Datapack.comment("get tagged lol"),
      commands.tag(null, "add", "imposter_role")
    }; build.createFunction("gogy/taggy");

  }

}
