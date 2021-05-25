package testPack;

import com.github.MASTRIO.Dyphae.*;
import com.github.MASTRIO.Dyphae.Commands.CommandBuilder;
import com.github.MASTRIO.Dyphae.Console.ConsoleLogger;

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
  public void onBuild() {

    @McFunction(
      name = "Cool Function",
      description = "A test idfk"
    )
    Function coolFunction = new Function("cool_function").setCommands(new String[] {
      CommandBuilder.say("mongus?"),
      CommandBuilder.give("@r", "minecraft:wooden_hoe", "Sus:1", 4)
    }).init();

  }

}
