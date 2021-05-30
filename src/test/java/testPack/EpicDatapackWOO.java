package testPack;

import com.github.MASTRIO.Dyphae.Command;
import com.github.MASTRIO.Dyphae.Core.Datapack;
import com.github.MASTRIO.Dyphae.Core.Function;
import com.github.MASTRIO.Dyphae.Core.MCFunction;

public class EpicDatapackWOO extends Datapack {

  // Objects
  static Datapack epicDatapack = new EpicDatapackWOO();

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
      Command.say("Hello I am loading")
    };
    tick = new String[] {
      Command.say("tick tock")
    };

    // Build the datapack
    epicDatapack.build();

  }

  @Override
  public void onBuild() {

    @MCFunction(
      name = "Cool Function",
      description = "A test idfk"
    )
      Function coolFunction = new Function("cool_function").setCommands(new String[] {
      Command.say("sus"),
      Command.give("@r", "minecraft:wooden_hoe", "Sus:1", 4),
    }).init();

    @MCFunction(deprecated = true)
      Function helloIAmFunction = new Function("hejjo").setCommands(new String[] {
        Command.say("goodbye"),
        Command.function("this", "cool_function")
    }).init();

  }

}
