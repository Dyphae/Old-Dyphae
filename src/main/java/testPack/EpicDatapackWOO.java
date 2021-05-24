package testPack;

import com.github.MASTRIO.JADF.Datapack;
import com.github.MASTRIO.JADF.Function;
import com.github.MASTRIO.JADF.McFunction;

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

    epicDatapack.build();

  }

  @Override
  public void functionList() {

    @McFunction(
      name = "Cool Function",
      description = "A test idfk"
    )
    Function coolFunction = new Function();
    coolFunction.setName("cool_function");
    coolFunction.setCommands = new String[] {
      "say Wazzup gamers?",
      "say are you sus?????!!??!?!"
    };
    coolFunction.init();

    @McFunction(
      author = "Not Bob Ross",
      notes = "bob ross didn't make this function"
    )
    Function someOtherThing = new Function();
    someOtherThing.setName("hello_hi_owo");
    someOtherThing.setCommands = new String[] {
      "give @a minecraft:diamond 69",
      "say u got da dimnd, poggers"
    };
    someOtherThing.init();

  }

}
