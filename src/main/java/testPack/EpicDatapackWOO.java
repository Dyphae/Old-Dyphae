package testPack;

import com.github.MASTRIO.JADF.*;

public class EpicDatapackWOO extends Datapack {

  // Objects
  static Datapack epicDatapack = new EpicDatapackWOO();
  // Variables

  // Main method
  public static void main(String[] args) {

    // Init Datapack
    init(
      "Epic Datapack",
      "epic",
      "A very epic datapack",
      "bob ross",
      "0.1.0"
    );

    // Set default functions
    load = new String[] {
      "say EPIC LOAD POG"
    };
    tick = new String[] {
      "say IUGAEKfhvbhj"
    };

    // Build the datapack
    epicDatapack.build();

  }

  @Override
  public void functionList() {

    @McFunction(
      name = "Cool Function",
      description = "A test idfk"
    )
    Function coolFunction = new Function("cool_function").setCommands(new Command[] {
      CommandBuilder.say("mongus?"),
      CommandBuilder.give("@r", "minecraft:wooden_hoe", "Sus:1", 4)
    }).init();

    @McFunction(
      author = "Not Bob Ross",
      notes = "bob ross didn't make this function"
    )
    Function someOtherThing = new Function("hello_hi_owo").setCommands(new Command[] {
      CommandBuilder.say("hello owo"),
      CommandBuilder.give("@a", "minecraft:diamond", 1)
    }).init();

    @McFunction(
      deprecated = true,
      name = "A VERY sus function"
    )
    Function sussyCommand = new Function("lil_sussy_boi").setCommands(new Command[] {
      CommandBuilder.say("lol burning trees are fun")
    }).init();

  }

}
