package testPack;

import com.github.MASTRIO.Dyphae.Builders.Selector;
import com.github.MASTRIO.Dyphae.Command;
import com.github.MASTRIO.Dyphae.Core.*;

public class EpicDatapackWOO extends Datapack {

  // Objects
  static Datapack epicDatapack = new EpicDatapackWOO();

  // Main method
  public static void main(String[] args) {

    // Init Datapack
    _init(
      "Epic Datapack",
      "epic",
      "A very epic datapack",
      "bob ross",
      "0.1.0"
    );

    // Set default functions
    _load = new String[] {
      Command.say("Hello I am loading")
    };
    _tick = new String[] {
      Command.say("tick tock")
    };

    // Build the datapack
    _openCompiler(epicDatapack);

  }

  @Override
  public void _onBuild() {

    @com.github.MASTRIO.Dyphae.Core.Selector(
      name = "Amongus imposter",
      deprecated = true
    )
    Selector imposter = new Selector("@e").setArgs(new String[] {
      "type=minecraft:zombie",
      "distance=5.."
    });

    @com.github.MASTRIO.Dyphae.Core.Selector(name = "Me obviously")
    Selector me = new Selector("MASTRIO");

    @MCFunction(
      name = "Cool Function",
      description = "A test idfk"
    )
      Function coolFunction = new Function("cool_function").setCommands(new String[] {
      Command.say("sus"),
      Command.give(imposter, "minecraft:wooden_hoe", "CustomModelData:69", 4),
      Command.give(me, "minecraft:diamond", 23)
    }).init();

    @MCFunction(deprecated = true)
      Function helloIAmFunction = new Function("hejjo").setCommands(new String[] {
        Command.say("goodbye"),
        Command.function("this", "cool_function")
    }).init();

  }

}
